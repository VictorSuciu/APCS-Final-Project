import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
 
import javax.swing.ImageIcon;
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
    
    Rectangle charHitBox = new Rectangle();
    JLabel character = new JLabel((new ImageIcon("Platformer Character.png")));
    Timer tm = new Timer(15, this);
    
    
    
    
    
    public GameChar(int x, int y) throws InterruptedException {
        
        charHitBox.setBounds(x, y, 60, 60);
        this.x = (double)x;
        this.y = (double)y;
        character.setBounds(x, y, 30, 30);
        Game.panel.add(character);
        vx = 0;
        vy = 0;
        tm.setRepeats(true);
        tm.start();
           
           
        new PlatformRegistry();
        Platform p1 = new Platform(0, 15, 6);
        PlatformRegistry.platList.add(p1);
        
        Platform p2 = new Platform(9, 15, 6);
        PlatformRegistry.platList.add(p2);
    
        Game.panel.addKeyListener(this);
        Game.panel.setFocusable(true);
        Game.panel.setFocusTraversalKeysEnabled(false);
        Game.panel.requestFocusInWindow();
          
            
            
 
    }
    
    
    @Override
    public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            
            if(key == KeyEvent.VK_RIGHT) {
                vx = 2.0;
                if(upPressed == false) {
                    repaint();
                }
                
            }
            if(key == KeyEvent.VK_LEFT) {
                vx = -2.0;
                if(upPressed == false) {
                    repaint();
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
            repaint();
        }
        if(key == KeyEvent.VK_LEFT) {
            vx = 0.0;
            repaint();
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
        
        System.out.println("canJump = " + canJump);
        System.out.println("upPressed = " + upPressed);
        System.out.println("requestJump = " + requestJump);
        
        for(Platform p : PlatformRegistry.platList) {
            if(charHitBox.intersects(p.getHitBox())) {
                   if(canJump == false) {
                       canJump = true;
                   }
                if(upPressed == false) {
                    vy = 0.0;
                    repaint();
                }
                if(requestJump == true) {
                    vy = -7.0;
                    repaint();
                }
                //System.out.println(upPressed);
                
            }
            
            else {
                requestJump = false;
                    if(canJump == true) {
                        canJump = false;
                    }
                vy += 0.2;
                repaint();
                //System.out.println(upPressed);
            }
        }
    }
    
    
    
    
    public void repaint() {
        x = x + vx;
        y = y + vy;
        character.setBounds((int)Math.round(x), (int)Math.round(y), 100, 100);
        charHitBox.setLocation(character.getX() + 15, character.getY() + 15);
 
        Game.panel.repaint();
    }
    
    
    
    
}
 
 
 
 
 
 
 
 
 
 
