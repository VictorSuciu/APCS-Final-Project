import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game implements KeyListener{
	
	JFrame frame = new JFrame("Platformer Game");
	JPanel panel = new JPanel();
	JLabel character = new JLabel((new ImageIcon("Platformer Character.png")));
	JLabel background = new JLabel(new ImageIcon("Platformer Background.png"));
	JButton button = new JButton(new ImageIcon("Platformer Character.png"));
	public Game() {
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		background.setBounds(0, 0, 800, 600);
	
		character.setBounds(100, 100, 100, 100);
		
		panel.add(character);
		panel.add(background);
		
	

		frame.setContentPane(panel);
		frame.setSize(800, 600);
		frame.setVisible(true);
		System.out.println("Finished");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT) {
			character.setBounds(character.getX() + 1, character.getY(), 100, 100);
			panel.repaint();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
