package com.mavis;

public class BubbleSortArray {

	public static void main(String[] args) {

		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i <= n.length - 1; i++) {
			for (int k = (i + 1); k <= n.length; k++) {
				if (n[i] > n[k]) {
					int tmp = n[i];
					n[i] = n[k];
					n[k] = tmp;
				}
			}
		}
		for (int num : n) {
			System.out.print(num + " ");
		}
	}
}
