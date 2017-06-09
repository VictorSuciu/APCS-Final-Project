
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JumpPad {

	private int x;
	private int y;

	private Rectangle padHitBox = new Rectangle(30, 8);

	JLabel pad;

	public JumpPad(int x, int y) {

		this.x = x * 30;
		this.y = y * 30 - 8;

		pad = new JLabel(new ImageIcon("Platformer Jump Pad.png"));

		pad.setBounds(this.x, this.y, 30, 8);

		Game.panel.add(pad);
		
		Game.panel.setComponentZOrder(pad, 0);
		
		padHitBox.setLocation(pad.getX(), pad.getY());
	}

	public Rectangle getHitBox() {
		return padHitBox;
	}

	public void remove() {
		Game.panel.remove(pad);
		padHitBox.reshape(0, 0, 0, 0);
	}
}

