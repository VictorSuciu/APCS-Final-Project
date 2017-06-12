import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Platform {

	private int x;
	private int y;
	private Rectangle platHitBox;
	JLabel box;
	ArrayList<JLabel> imgList = new ArrayList();

	public Platform(int x, int y, int length) {

		this.x = x * 30;
		this.y = y * 30;
		for (int i = 0; i < length; i++) {
			box = new JLabel(new ImageIcon("Platformer Platform.png"));
			box.setBounds(this.x + (30 * i), this.y, 30, 30);
			imgList.add(box);

			Game.panel.add(box);
			Game.panel.setComponentZOrder(box, 0);
		}

		platHitBox = new Rectangle(this.x, this.y, 30 * length, 30);

	}

	public Rectangle getHitBox() {

		return platHitBox;
	}

	public void remove() {
		for (JLabel jl : imgList) {
			Game.panel.remove(jl);
		}
		platHitBox.reshape(0, 0, 0, 0);
	}
	
}
