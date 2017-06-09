import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Flag {

	private int x;
	private int y;

	private Rectangle flagHitBox = new Rectangle(30, 60);

	JLabel flag;

	public Flag(int x, int y) {

		this.x = x * 30;
		this.y = y * 30;

		flag = new JLabel(new ImageIcon("Platformer Flag.png"));

		flag.setBounds(this.x, this.y, 30, 60);

		Game.panel.add(flag);
		flagHitBox.setLocation(flag.getX(), flag.getY());
	}

	public Rectangle getHitBox() {
		return flagHitBox;
	}

	public void remove() {
		Game.panel.remove(flag);
	}
}
