import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.Timer;

public class GameChar implements ActionListener, KeyListener {

	private double x;
	private double y;
	private double vx;
	private double vy;
	private int levelsWon = 0;

	// These are the booleans that hold data about the state of the character.
	// These include
	// collisions, the ability to jump, and win status of the game.
	boolean upPressed = false;
	boolean canJump = false;
	boolean requestJump = false;
	boolean touchingPlat = false;
	boolean bounceOffBottom = false;
	boolean touchingLeftSide = false;
	boolean touchingRightSide = false;
	boolean touchingTop = false;
	public boolean touchingFlag = false;
	boolean addedWin = false;

	// These are the two hitboxes of the character that detect collisions with
	// the platforms' hitboxes
	// lrHitBox detects collisions on the side of platforms, and charHitBox
	// detects collisions on
	// the tops and bottoms of them.
	Rectangle charHitBox = new Rectangle();
	Rectangle lrHitBox = new Rectangle();

	JLabel character = new JLabel((new ImageIcon("Platformer Character.png")));
	Timer tm = new Timer(15, this);

	public GameChar(int x, int y) throws InterruptedException {

		charHitBox.setBounds(x, y, 30, 30);
		lrHitBox.setBounds(x - 5, y + 10, 40, 15);

		this.x = (double) x;
		this.y = (double) y;
		character.setBounds(x, y, 15, 15);
		Game.panel.add(character);
		vx = 0;
		vy = 0;
		tm.setRepeats(true);
		tm.start();

		new ComponentRegistry();

		new Level();

		Level.level1();
		Game.panel.setComponentZOrder(character, 0);

		Game.panel.addKeyListener(this);
		Game.panel.setFocusable(true);
		Game.panel.setFocusTraversalKeysEnabled(false);
		Game.panel.requestFocusInWindow();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			if (touchingLeftSide == false) {
				vx = 2.0;
				
			}

		}
		if (key == KeyEvent.VK_LEFT) {
			if (touchingRightSide == false) {
				vx = -2.0;
				
			}
		}
		if (key == KeyEvent.VK_UP) {
			if (canJump == true) {
				requestJump = true;
				upPressed = true;
				
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			vx = 0.0;
			
		}
		if (key == KeyEvent.VK_LEFT) {
			vx = 0.0;
			
		}
		if (key == KeyEvent.VK_UP) {
			upPressed = false;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(upPressed);

		for (Platform p : ComponentRegistry.platList) {
			if (charHitBox.intersects(p.getHitBox())) {
				touchingPlat = true;
			}
			if (lrHitBox.intersects(p.getHitBox())) {
				if (vx < 0) {
					touchingRightSide = true;
				}
				if (vx > 0) {
					touchingLeftSide = true;
				}
			}

		}
		for (Flag f : ComponentRegistry.flagList) {
			if (charHitBox.intersects(f.getHitBox()) && addedWin == false) {
				touchingFlag = true;
			}
		}
		if (touchingPlat == true) {
			if (canJump == false) {
				canJump = true;
			}
			if (requestJump == true) {
				vy = -5.5;
				// repaint();
			} else if (vy < 0.0) {
				bounceOffBottom = true;
				
			} else if (requestJump == false) {

				vy = 0.0;
				// repaint();

			}
			if (bounceOffBottom == true) {
				vy = 3.0;

			}
		}

		else {
			requestJump = false;
			
			if (canJump == true) {
				canJump = false;
			}
			vy += 0.2;

			bounceOffBottom = false;
		}

		if (touchingLeftSide == true) {
			vx = -2.0;
		} 
		
		else if (touchingRightSide == true) {
			vx = 2.0;
			// repaint();
		}

		if (y > 600 || x < -60 || x > 800) {
			x = 20;
			y = 300;
			vx = 0;
			vy = 0;
			repaint();
		}

		if (touchingFlag == true) {
			touchingFlag = false;
			levelsWon++;
			System.out.println(levelsWon);
			if (levelsWon == Level.numberOfLevels) {
				JLabel winScreen = new JLabel(new ImageIcon("Platformer You Win.png"));
				winScreen.setBounds(0, 0, 800, 600);

				Game.panel.add(winScreen);
				Game.panel.setComponentZOrder(winScreen, 0);
				touchingFlag = false;
				addedWin = true;
			} else {
				if (levelsWon == 1) {
					System.out.println("Making level 2");
					Level.level2();
					Game.panel.setComponentZOrder(character, 0);
					x = 20;
					y = 400;
					repaint();
				}
			}

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
		character.setBounds((int) Math.round(x), (int) Math.round(y), 100, 100);

		charHitBox.setLocation(character.getX() + 35, character.getY() + 35);
		lrHitBox.setLocation((int) charHitBox.getX() - 5, (int) charHitBox.getY() + 8);

		Game.panel.repaint();
	}

}
