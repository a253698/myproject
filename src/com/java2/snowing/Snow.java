package com.java2.snowing;
//為甚麼要寫snow建構子，做好初始化，之後呼價snow就不用重新設定x，可以直接運用。

import java.util.Random;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;

	public Snow() {
		x = random.nextInt(600);
	}
	
//	private static char[] repeat(String string, int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//    public static void main(String[] args) {
//        System.out.println(repeat("*", 5));
//    }

	public void run() {
		for (int i = 800; i > 0; i--) {
//			System.out.println(getName() + ":(" + x + "," + y + ")");
			y = y - 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			System.out.print(new String(new char[x]).replaceAll("\0", " "));
			System.out.println("*");}
	}
}
