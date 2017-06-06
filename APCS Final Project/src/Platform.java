import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Platform {
    
    private int x;
    private int y;
    private Rectangle platHitBox;
    
    
    
    public Platform(int x, int y, int length) {
        
        this.x = x * 30;
        this.y = y * 30;
        for(int i = 0; i < length; i++) {
            JLabel box = new JLabel(new ImageIcon("Platformer Platform.png"));
            box.setBounds(this.x + (30 * i), this.y, 30, 30);
            Game.panel.add(box);
        }
        
        platHitBox = new Rectangle(this.x, this.y, 30 * length, 30);
       
 
    }
    
    public Rectangle getHitBox() {
        
        return platHitBox;
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
