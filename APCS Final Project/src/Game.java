import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game{
    
    JFrame frame = new JFrame("Platformer Game");
    public static JPanel panel = new JPanel();
    JLabel background = new JLabel(new ImageIcon("Platformer Background.png"));
    JButton button = new JButton(new ImageIcon("Platformer Character.png"));
    
    
    public Game() throws InterruptedException {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        
        frame.setContentPane(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
            
        new ComponentRegistry();
        
        
        GameChar gamechar = new GameChar(20, 300);
        
        background.setBounds(0, 0, 800, 600);
        panel.add(background);
        
    }
    
 
    
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
