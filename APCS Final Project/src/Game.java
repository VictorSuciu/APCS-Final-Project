
/*
 * This class initializes all of the components of the game, those being the background image,
 * the yellow character, and indirectly, the platforms (the platforms are initialized in the
 * GameChar class). 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

	JFrame frame = new JFrame("Platformer Game"); // The window
	public static JPanel panel = new JPanel(); // The panel that goes in the
												// window, and holds the
												// components
	
	JLabel background = new JLabel(new ImageIcon("Platformer Background.png")); // the
																				// background
																				// JLabel

	public Game() throws InterruptedException {

		// These are the necessary methods that must be called in any GUI to
		// make it run correctly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);

		frame.setContentPane(panel);
		frame.setSize(800, 600);
		frame.setVisible(true);

		// This is where the smiley face character gets initialized
		GameChar gamechar = new GameChar(20, 350);

		// adding the background
		background.setBounds(0, 0, 800, 600);
		panel.add(background);

	}

}
