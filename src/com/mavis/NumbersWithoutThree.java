package com.mavis;

public class NumbersWithoutThree {

	public static void main(String[] args) {

		for (int i = 1; i <= 13; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println(" ");

		int n = 1;
		while (n <= 13) {
			System.out.print(n + " ");
			n = n + 1;
			if(n % 3 == 0){
				n = n + 1;
				continue;
			}
		}
	}
}
