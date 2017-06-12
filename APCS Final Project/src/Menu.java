import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu implements ActionListener, MouseListener{

	Timer timer = new Timer(15, this);
	
	JLabel play = new JLabel(new ImageIcon("Platformer Play Button.png"));
	JLabel instructions = new JLabel(new ImageIcon("Platformer Play Button.png"));
	JLabel back = new JLabel(new ImageIcon("Platformer Play Button.png"));
	
	Rectangle mouseRec = new Rectangle(1, 1, 1, 1);
	Rectangle playHitBox = new Rectangle();
	Rectangle insHitBox = new Rectangle();
	Rectangle backHitBox = new Rectangle();
	
	
	public Menu() {
		timer.start();
		timer.setRepeats(true);
		
		play.setBounds(100, 150, 200, 125);
		instructions.setBounds(50, 500, 500, 125);
		
		Game.panel.add(play);
		Game.panel.add(instructions);
		
		back.setBounds(0, 0, 150, 75);
		
		playHitBox.setBounds(100, 100, 200, 125);
		insHitBox.setBounds(50, 300, 500, 125);
		backHitBox.setBounds(0, 0, 150, 75);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		mouseRec.setLocation(MouseInfo.getPointerInfo().getLocation());
		
		
	}
	
}
