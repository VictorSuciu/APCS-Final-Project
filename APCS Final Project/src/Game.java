
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
	
	public Game() throws InterruptedException {

		// These are the necessary methods that must be called in any GUI to
		// make it run correctly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		
		
		frame.setContentPane(panel);
		new Menu();
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		System.out.println("Creating menu");
		

	}
	
	public static void start() {
		// This is where the smiley face character gets initialized
		
		try {
			GameChar gamechar = new GameChar(20, 350);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
