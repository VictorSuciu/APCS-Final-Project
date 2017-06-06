import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Flag {
	
	private int x;
	private int y;
	public Flag(int x, int y) {
		
		this.x = x * 30;
		this.y = y * 30;
		
		JLabel flag = new JLabel(new ImageIcon("Platformer Flag.png"));
		
		flag.setBounds(this.x, this.y, 60, 30);
	}
	
}
