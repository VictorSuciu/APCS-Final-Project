
public class Level {

	public static int numberOfLevels = 2;

	public Level() {

	}

	public static void eraseLast() {
		for (Platform p : ComponentRegistry.platList) {
			p.remove();
			Game.panel.repaint();
		}

		for (Flag f : ComponentRegistry.flagList) {
			f.remove();
			Game.panel.repaint();
		}
		for (JumpPad jp : ComponentRegistry.padList) {
			jp.remove();
			Game.panel.repaint();
		}
	}

	public static void level1() {

		Platform p1 = new Platform(0, 16, 6);
		ComponentRegistry.platList.add(p1);
		
		JumpPad jp1 = new JumpPad(8, 18);
		ComponentRegistry.padList.add(jp1);
		
		Platform p2 = new Platform(9, 15, 6);
		ComponentRegistry.platList.add(p2);

		Platform p3 = new Platform(17, 13, 4);
		ComponentRegistry.platList.add(p3);

		Platform p4 = new Platform(23, 11, 2);
		ComponentRegistry.platList.add(p4);

		Platform p5 = new Platform(18, 9, 3);
		ComponentRegistry.platList.add(p5);

		Platform p6 = new Platform(14, 9, 1);
		ComponentRegistry.platList.add(p6);

		Platform p7 = new Platform(10, 9, 1);
		ComponentRegistry.platList.add(p7);

		Platform p8 = new Platform(6, 8, 1);
		ComponentRegistry.platList.add(p8);

		Platform p9 = new Platform(0, 18, 27);
		ComponentRegistry.platList.add(p9);

		Platform p10 = new Platform(0, 8, 6);
		ComponentRegistry.platList.add(p10);

		Platform p11 = new Platform(1, 6, 1);
		ComponentRegistry.platList.add(p11);

		Platform p12 = new Platform(5, 4, 3);
		ComponentRegistry.platList.add(p12);

		Platform p13 = new Platform(11, 4, 3);
		ComponentRegistry.platList.add(p13);

		Platform p14 = new Platform(17, 4, 3);
		ComponentRegistry.platList.add(p14);

		Platform p15 = new Platform(22, 4, 5);
		ComponentRegistry.platList.add(p15);

		Flag endFlag = new Flag(25, 2);
		ComponentRegistry.flagList.add(endFlag);
	}

	public static void level2() {

		eraseLast();
		Platform p1 = new Platform(0, 16, 6);
		ComponentRegistry.platList.add(p1);

		Platform p2 = new Platform(8, 14, 1);
		ComponentRegistry.platList.add(p2);

		Platform p3 = new Platform(13, 15, 1);
		ComponentRegistry.platList.add(p3);
		
		Platform p4 = new Platform(18, 14, 2);
		ComponentRegistry.platList.add(p4);
		
		Platform p5 = new Platform(23, 12, 3);
		ComponentRegistry.platList.add(p5);

		Platform p6 = new Platform(19, 11, 1);
		ComponentRegistry.platList.add(p6);

		Platform p7 = new Platform(16, 9, 2);
		ComponentRegistry.platList.add(p7);
		
		Platform p8 = new Platform(20, 7, 5);
		ComponentRegistry.platList.add(p8);

		Platform p9 = new Platform(21, 6, 4);
		ComponentRegistry.platList.add(p9);

		Platform p10 = new Platform(22, 5, 3);
		ComponentRegistry.platList.add(p10);

		Platform p11 = new Platform(23, 4, 2);
		ComponentRegistry.platList.add(p11);

		Platform p12 = new Platform(24, 3, 1);
		ComponentRegistry.platList.add(p12);

		Platform p13 = new Platform(12, 2, 8);
		ComponentRegistry.platList.add(p13);

		Platform p14 = new Platform(2, 10, 5);
		ComponentRegistry.platList.add(p14);

		Flag endFlag = new Flag(3, 8);
		ComponentRegistry.flagList.add(endFlag);

	}

}
