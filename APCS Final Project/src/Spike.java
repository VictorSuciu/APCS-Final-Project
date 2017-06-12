
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Spike {

	private int x;
	private int y;

	private Rectangle spikeHitBox = new Rectangle(30, 30);

	JLabel spike;

	public Spike(int x, int y) {

		this.x = x * 30;
		this.y = y * 30;

		spike = new JLabel(new ImageIcon("Platformer Spike.png"));

		spike.setBounds(this.x, this.y, 30, 30);

		Game.panel.add(spike);
		
		Game.panel.setComponentZOrder(spike, 0);
		
		spikeHitBox.setLocation(spike.getX(), spike.getY());
	}

	public Rectangle getHitBox() {
		return spikeHitBox;
	}

	public void remove() {
		Game.panel.remove(spike);
		spikeHitBox.reshape(0, 0, 0, 0);
	}
}


