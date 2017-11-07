package com.mavis;

public class Prime {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("NOT　PRIME NUMBER");
				break;
			}
			System.out.println(n + "IS PRIME NUMBER !");
		}
	}

}
