import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
 
import javax.swing.ImageIcon;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.Timer;
 
public class GameChar implements ActionListener, KeyListener{
    
    private double x;
    private double y;
    private double vx;
    private double vy;
   
    boolean upPressed = false;
    boolean canJump = false;
    boolean requestJump = false;
    boolean touchingPlat = false;
    boolean bounceOffBottom = false;
    boolean touchingLeftSide = false;
    boolean touchingRightSide = false;
    boolean touchingTop = false;
    
    Rectangle charHitBox = new Rectangle();
    Rectangle lrHitBox = new Rectangle();
 
    
    JLabel character = new JLabel((new ImageIcon("Platformer Character.png")));
    Timer tm = new Timer(15, this);
    
    
    
    
    
    public GameChar(int x, int y) throws InterruptedException {
        
        charHitBox.setBounds(x, y, 30, 30);
        lrHitBox.setBounds(x - 5, y + 10, 40, 15);
        
        
        this.x = (double)x;
        this.y = (double)y;
        character.setBounds(x, y, 15, 15);
        Game.panel.add(character);
        vx = 0;
        vy = 0;
        tm.setRepeats(true);
        tm.start();
           
           
        new PlatformRegistry();
        Platform p1 = new Platform(0, 16, 6);
        PlatformRegistry.platList.add(p1);
        
           Platform p2 = new Platform(9, 15, 6);
           PlatformRegistry.platList.add(p2);
           
           Platform p3 = new Platform(17, 13, 4);
           PlatformRegistry.platList.add(p3);
        
           Platform p4 = new Platform(23, 11, 2);
           PlatformRegistry.platList.add(p4);
           
           Platform p5 = new Platform(18, 9, 3);
           PlatformRegistry.platList.add(p5);
           
           Platform p6 = new Platform(14, 9, 1);
           PlatformRegistry.platList.add(p6);
           
           Platform p7 = new Platform(10, 9, 1);
           PlatformRegistry.platList.add(p7);
           
           Platform p8 = new Platform(6, 8, 1);
           PlatformRegistry.platList.add(p8);
           
           Platform p9 = new Platform(0, 18, 28);
           PlatformRegistry.platList.add(p9);
           
           Platform p10 = new Platform(0, 8, 6);
           PlatformRegistry.platList.add(p10);
           
        Platform p11 = new Platform(1, 6, 1);
           PlatformRegistry.platList.add(p11);
           
        Platform p12 = new Platform(5, 4, 3);
           PlatformRegistry.platList.add(p12);
           
        Platform p13 = new Platform(11, 4, 3);
           PlatformRegistry.platList.add(p13);
           
           Platform p14 = new Platform(17, 4, 3);
           PlatformRegistry.platList.add(p14);
           
           Platform p15 = new Platform(22, 4, 5);
           PlatformRegistry.platList.add(p15);
           
           
       
        Game.panel.addKeyListener(this);
        Game.panel.setFocusable(true);
        Game.panel.setFocusTraversalKeysEnabled(false);
        Game.panel.requestFocusInWindow();
          
    }
    
    
    @Override
    public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            
            if(key == KeyEvent.VK_RIGHT) {
                if(touchingLeftSide == false) {
                    vx = 2.0;
                    if(upPressed == false) {
                        //repaint();
                    }
                }
                
            }
            if(key == KeyEvent.VK_LEFT) {
                if(touchingRightSide == false) {
                    vx = -2.0;
                    if(upPressed == false) {
                        //repaint();
                    }
                }
            }
           if(key == KeyEvent.VK_UP) {
               if(canJump == true) {
                   requestJump = true;
                   upPressed = true;
                   //vy = -7.0;
                   //System.out.println(vy);
               }
          }
        
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_RIGHT) {
            vx = 0.0;
            //repaint();
        }
        if(key == KeyEvent.VK_LEFT) {
            vx = 0.0;
            //repaint();
        }
        if(key == KeyEvent.VK_UP) {
            upPressed = false;
        }
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
           
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        System.out.println("canJump = " + canJump);
        System.out.println("upPressed = " + upPressed);
        System.out.println("requestJump = " + requestJump);
        */
        
        System.out.println("leftSide = " + touchingLeftSide);
        System.out.println("rightSide = " + touchingRightSide);
        
        for(Platform p : PlatformRegistry.platList) {
               if(charHitBox.intersects(p.getHitBox())) {
                   touchingPlat = true;
               }
               if(lrHitBox.intersects(p.getHitBox())) {
                     if(vx < 0) {
                         touchingRightSide = true;
                     }
                     if(vx > 0) {
                         touchingLeftSide = true;
                     }
             }
            
             
        }
            if(touchingPlat == true) {
                if(canJump == false) {
                    canJump = true;
                }
                if(requestJump == true) {
                    vy = -5.5;
                    //repaint();
                }
                else if(vy < 0.0) {
                        bounceOffBottom = true;
                }
                else if(upPressed == false) {
                    
                     vy = 0.0;
                     //repaint();
                    
                }
                if(bounceOffBottom == true) {
                    vy = 3.0;
                    
                }
                    
                //System.out.println(upPressed);
                
            }
            
            else {
                requestJump = false;
                if(canJump == true) {
                       canJump = false;
                }
                vy += 0.2;
                //repaint();
                
                bounceOffBottom = false;
            }
            
            if(touchingLeftSide == true) {
                vx = -2.0;
                //repaint();
                
            }
            else if(touchingRightSide == true) {
                vx = 2.0;
                //repaint();
            }
            
            
            touchingPlat = false;
            
            
            touchingLeftSide = false;
            touchingRightSide = false;
            touchingTop = false;
            
            repaint();
            
    }
    
    
    
    
    public void repaint() {
        x = x + vx;
        y = y + vy;
        character.setBounds((int)Math.round(x), (int)Math.round(y), 100, 100);
        
        charHitBox.setLocation(character.getX() + 35, character.getY() + 35);
        lrHitBox.setLocation((int)charHitBox.getX() - 5, (int)charHitBox.getY() + 8); 
        
        
        Game.panel.repaint();
    }
    
    
    
    
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
