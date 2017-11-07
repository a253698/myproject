package com.mavis;

public class NinerHorizontal {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int i = 2; i <= 5; i++) {
				System.out.print(i + "x" + n + "=" + (n * i) + "\t");
				if ((i) % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}