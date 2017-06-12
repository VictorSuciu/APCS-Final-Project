
/*
 * This class initializes all of the components of the game, those being the background image,
 * the yellow character, and indirectly, the platforms (the platforms are initialized in the
 * GameChar class). 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game implements ActionListener, MouseListener {

	JFrame frame = new JFrame("Platformer Game"); // The window
	public static JPanel panel = new JPanel(); // The panel that goes in the
												// window, and holds the
												// components

	JLabel background = new JLabel(new ImageIcon("Platformer Background.png")); // the
																				// background
																				// JLabel
	
	int playX = 300;
	int playY = 150;
	int insX = 150;
	int insY = 320;
	int backX = 325;
	int backY = 500;
	Timer timer = new Timer(15, this);
	
	JLabel play = new JLabel(new ImageIcon("Platformer Play Button.png"));
	JLabel instructions = new JLabel(new ImageIcon("Platformer Instructions Button.png"));
	JLabel back = new JLabel(new ImageIcon("Platformer Back Button.png"));
	JLabel insScreen = new JLabel(new ImageIcon("Platformer Instructions screen.png"));
	
	Rectangle mouseRec = new Rectangle(1, 1, 1, 1);
	Rectangle playHitBox = new Rectangle();
	Rectangle insHitBox = new Rectangle();
	Rectangle backHitBox = new Rectangle();
	
	public Game() throws InterruptedException {

		// These are the necessary methods that must be called in any GUI to
		// make it run correctly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		panel.addMouseListener(this);
		
		frame.setContentPane(panel);
		frame.setSize(800, 600);
		frame.setVisible(true);

		timer.start();
		timer.setRepeats(true);
		
		play.setBounds(playX, playY, 200, 125);
		instructions.setBounds(insX, insY, 500, 125);
		
		Game.panel.add(play);
		Game.panel.add(instructions);
		
		back.setBounds(0, 0, 150, 75);
		
		playHitBox.setBounds(playX, playY + 50, 200, 125);
		insHitBox.setBounds(insX, insY + 50, 500, 125);
		backHitBox.setBounds(0, 0, 150, 75);

		// adding the background
		background.setBounds(0, 0, 800, 600);
		panel.add(background);

	}
	
	public void start() {
		// This is where the smiley face character gets initialized
		timer.stop();
		try {
			GameChar gamechar = new GameChar(20, 350);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		if(mouseRec.intersects(playHitBox)) {
			playHitBox.reshape(-10, -10, 0, 0);
			insHitBox.reshape(-10, -10, 0, 0);
			panel.remove(play);
			panel.remove(instructions);
			start();
		}
		else if(mouseRec.intersects(insHitBox)) {
			System.out.println("Start");
			panel.remove(play);
			panel.remove(instructions);
			panel.remove(background);
			playHitBox.reshape(-10, -10, 0, 0);
			insHitBox.reshape(-10, -10, 0, 0);
			
			back.setBounds(325, 500, 150, 75);
			panel.add(back);
			insScreen.setBounds(0, 0, 800, 600);
			panel.add(insScreen);
			backHitBox.setBounds(backX, backY + 40, 150, 75);
			panel.repaint();
		}
		else if(mouseRec.intersects(backHitBox)) {
			panel.remove(back);
			panel.remove(insScreen);
			
			playHitBox.setBounds(playX, playY + 50, 200, 125);
			insHitBox.setBounds(insX, insY + 50, 500, 125);
			backHitBox.setBounds(-10, -10, 0, 0);
			
			play.setBounds(playX, playY, 200, 125);
			instructions.setBounds(insX, insY, 500, 125);
			
			Game.panel.add(play);
			Game.panel.add(instructions);
			
			panel.add(background);
			
			panel.repaint();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mouseRec.setLocation(MouseInfo.getPointerInfo().getLocation());

	}

}
