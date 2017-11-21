package com.mavis;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		
		 n = 1;
		while (n < 10) {
			System.out.print(n + " ");
			n = n + 1;
		}
	}
}
