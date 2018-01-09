package com.mavis;

public class Dice3 {

	public static void main(String[] args) {
		// int n0;
		// int n1;
		// int n2;
		int n[] = new int[3];
		n[0] = 4;
		n[1] = 5;
		n[2] = 5;
		for (int i = 0; i < 3; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		int a[] = { 4, 5, 6, };
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();

		int b[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int p : b) {
			// 陣列b的編號為p
			System.out.print(p + " ");
		}

	}

}