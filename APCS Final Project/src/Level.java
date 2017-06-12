
public class Level {

	public static int numberOfLevels = 5;

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
	public static void level3() {
		eraseLast();
		
		Platform p1 = new Platform(0, 16, 7);
		ComponentRegistry.platList.add(p1);
		
		JumpPad jp1 = new JumpPad(6, 16);
		ComponentRegistry.padList.add(jp1);
		
		Platform p2 = new Platform(10, 7, 7);
		ComponentRegistry.platList.add(p2);
		
		Flag endFlag = new Flag(14, 5);
		ComponentRegistry.flagList.add(endFlag);
		
		
	}
	
	
	public static void level4() {
		eraseLast();
		Platform p1 = new Platform(0, 16, 4);
		ComponentRegistry.platList.add(p1);
		
		JumpPad jp1 = new JumpPad(3, 16);
		ComponentRegistry.padList.add(jp1);
		
		Platform p2 = new Platform(8, 12, 1);
		ComponentRegistry.platList.add(p2);
		
		JumpPad jp2 = new JumpPad(8, 12);
		ComponentRegistry.padList.add(jp2);
		
		Platform p3 = new Platform(13, 14, 1);
		ComponentRegistry.platList.add(p3);
		
		JumpPad jp3 = new JumpPad(13, 14);
		ComponentRegistry.padList.add(jp3);
		
		Platform p4 = new Platform(18, 13, 1);
		ComponentRegistry.platList.add(p4);
		
		JumpPad jp4 = new JumpPad(18, 13);
		ComponentRegistry.padList.add(jp4);
		
		Platform p5 = new Platform(22, 5, 5);
		ComponentRegistry.platList.add(p5);
		
		Flag endFlag = new Flag(25, 3);
		ComponentRegistry.flagList.add(endFlag);
		
		
		
		
	}
	
	public static void level5() {
		
		eraseLast();
		
		Platform p1 = new Platform(0, 17, 5);
		ComponentRegistry.platList.add(p1);
		
		Spike s1 = new Spike(4, 16);
		ComponentRegistry.spikeList.add(s1);
		
		Platform p2 = new Platform(7, 17, 1);
		ComponentRegistry.platList.add(p2);
		
		JumpPad jp1 = new JumpPad(7, 17);
		ComponentRegistry.padList.add(jp1);
		
		Platform p3 = new Platform(10, 13, 6);
		ComponentRegistry.platList.add(p3);
		
		Spike s4 = new Spike(10, 12);
		ComponentRegistry.spikeList.add(s4);
		
		Spike s2 = new Spike(11, 12);
		ComponentRegistry.spikeList.add(s2);
		
		Spike s3 = new Spike(14, 12);
		ComponentRegistry.spikeList.add(s3);
		
		Platform p4 = new Platform(19, 12, 3);
		ComponentRegistry.platList.add(p4);
		
		Platform p5 = new Platform(23, 15, 1);
		ComponentRegistry.platList.add(p5);
		
		JumpPad jp2 = new JumpPad(23, 15);
		ComponentRegistry.padList.add(jp2);
		
		Platform p6 = new Platform(20, 7, 4);
		ComponentRegistry.platList.add(p6);
		
		Platform p7 = new Platform(18, 7, 1);
		ComponentRegistry.platList.add(p7);
		
		Spike s5 = new Spike(18, 6);
		ComponentRegistry.spikeList.add(s5);
		
		Platform p8 = new Platform(12, 6, 5);
		ComponentRegistry.platList.add(p8);
		
		Platform p9 = new Platform(8, 5, 4);
		ComponentRegistry.platList.add(p9);
		
		Spike s6 = new Spike(13, 5);
		ComponentRegistry.spikeList.add(s6);
		
		Spike s7 = new Spike(10, 4);
		ComponentRegistry.spikeList.add(s7);
		
		Platform p10 = new Platform(4, 11, 1);
		ComponentRegistry.platList.add(p10);
		
		JumpPad jp3 = new JumpPad(4, 11);
		ComponentRegistry.padList.add(jp3);
		
		Platform p11 = new Platform(0, 2, 3);
		ComponentRegistry.platList.add(p11);
		
		Platform p12 = new Platform(5, 10, 1);
		ComponentRegistry.platList.add(p12);
		
		Platform p13 = new Platform(5, 9, 1);
		ComponentRegistry.platList.add(p13);
		
		Platform p14 = new Platform(5, 8, 1);
		ComponentRegistry.platList.add(p14);
		
		Platform p15 = new Platform(5, 7, 1);
		ComponentRegistry.platList.add(p15);
		
		Platform p16 = new Platform(5, 6, 1);
		ComponentRegistry.platList.add(p16);
		
		Platform p18 = new Platform(5, 11, 1);
		ComponentRegistry.platList.add(p18);
		
		Platform p17 = new Platform(5, 5, 3);
		ComponentRegistry.platList.add(p17);
		
		Flag endFlag = new Flag(0, 0);
		ComponentRegistry.flagList.add(endFlag);
	}

}
