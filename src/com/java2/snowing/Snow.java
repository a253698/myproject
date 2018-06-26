package com.java2.snowing;

//為甚麼要寫snow建構子，做好初始化，之後呼價snow就不用重新設定x，可以直接運用。
import java.awt.Canvas;
import java.util.Random;

import com.java2.snowing.SnowFrame.SnowCanvas;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;
	private SnowCanvas snowCanvas;

	public Snow(SnowCanvas snowCanvas) {
		this.snowCanvas = snowCanvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	// private static char[] repeat(String string, int i) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// public static void main(String[] args) {
	// System.out.println(repeat("*", 5));
	// }

	@Override
	public void run() {
		for (int i = 0; i < 800; i++) {
			// System.out.println(getName() + ":(" + x + "," + y + ")");
			// y = y - 1;
			y = y + 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			snowCanvas.repaint();

			try {
				sleep(50);
				// 慢0.05秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// System.out.print(new String(new char[x]).replaceAll("\0", " "));
			// System.out.println("*");}
		}
	}
}
