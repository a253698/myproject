package com.mavis;

public class NineLazyPractic {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {

			for (int i = 2; i <= 9; i++) {
				if (n > 3 && n < 9) {
					if (n > 4 && n < 9) {
						continue;
					}
					System.out.print(" " + "..." + "\t");
				} else {
					if ((n * i) < 10) {
						System.out.print(i + "x" + n + "= " + (n * i) + "\t");
					} else {
						System.out.print(i + "x" + n + "=" + (n * i) + "\t");
					}
				}
			}
			if (n < 4 || n > 7) {
				System.out.println();
			}
		}
	}
}