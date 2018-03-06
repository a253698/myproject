package com.java2.object;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		int a = -1;
		while (a != 0) {
			
			for (int k = 1; k <= 6; k++) {
				Random r = new Random();
				int q1 = r.nextInt((4) + 1);
				System.out.print(q1 + "\t");
			}
			a = 0;
			
		}

	}

}
