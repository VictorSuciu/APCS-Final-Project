import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu implements ActionListener, MouseListener {

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
	
	public Menu() {
		Game.panel.addMouseListener(this);
		timer.start();
		timer.setRepeats(true);
		
		play.setBounds(playX, playY, 200, 125);
		instructions.setBounds(insX, insY, 500, 125);
		
		System.out.println("Adding play and instructions buttons");
		Game.panel.add(play);
		Game.panel.add(instructions);
		
		back.setBounds(0, 0, 150, 75);
		
		playHitBox.setBounds(playX, playY + 20, 200, 125);
		insHitBox.setBounds(insX, insY + 20, 500, 125);
		backHitBox.setBounds(0, 0, 150, 75);

		// adding the background
		background.setBounds(0, 0, 800, 600);
		Game.panel.add(background);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		if(mouseRec.intersects(playHitBox)) {
			playHitBox.reshape(-10, -10, 0, 0);
			insHitBox.reshape(-10, -10, 0, 0);
			Game.panel.remove(play);
			Game.panel.remove(instructions);
			timer.stop();
			Game.start();
		}
		else if(mouseRec.intersects(insHitBox)) {
			System.out.println("Start");
			Game.panel.remove(play);
			Game.panel.remove(instructions);
			Game.panel.remove(background);
			playHitBox.reshape(-10, -10, 0, 0);
			insHitBox.reshape(-10, -10, 0, 0);
			
			back.setBounds(325, 500, 150, 75);
			Game.panel.add(back);
			insScreen.setBounds(0, 0, 800, 600);
			Game.panel.add(insScreen);
			backHitBox.setBounds(backX, backY + 20, 150, 75);
			Game.panel.repaint();
		}
		else if(mouseRec.intersects(backHitBox)) {
			Game.panel.remove(back);
			Game.panel.remove(insScreen);
			
			playHitBox.setBounds(playX, playY + 20, 200, 125);
			insHitBox.setBounds(insX, insY + 20, 500, 125);
			backHitBox.setBounds(-10, -10, 0, 0);
			
			play.setBounds(playX, playY, 200, 125);
			instructions.setBounds(insX, insY, 500, 125);
			
			Game.panel.add(play);
			Game.panel.add(instructions);
			
			Game.panel.add(background);
			
			Game.panel.repaint();
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
