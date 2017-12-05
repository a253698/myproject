package com.mavis;

public class BobbleSortTeacher {

	public static void main(String[] args) {
		int n[] = { 55, 6, 31, 77, 13 };
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				System.out.println(i + " " + j);
				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;

				}
			}
		}
		for (int num : n) {
			System.out.print(num + " ");
		}
	}
}
