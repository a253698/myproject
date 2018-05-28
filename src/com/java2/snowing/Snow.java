package com.java2.snowing;

//為甚麼要寫snow建構子，做好初始化，之後呼價snow就不用重新設定x，可以直接運用。
import java.awt.Canvas;
import java.util.Random;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;
	private Canvas canvas;

	public Snow() {
		this.canvas = canvas;
		x = random.nextInt(600);
		y = random.nextInt(1000);
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
		for (int i = 800; i > 0; i++) {
//			System.out.println(getName() + ":(" + x + "," + y + ")");
//			y = y - 1;
			y = y + 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			
//			canvas.repaint();
			
			try {
				sleep(50);
				//慢0.05秒
				canvas.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			System.out.print(new String(new char[x]).replaceAll("\0", " "));
//			System.out.println("*");}
	}
}
}
