package com.mavis;

public class Prime2 {

	public static void main(String[] args) {
		int n = 117;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(n + " IS PRIME NUMBER !");
		} else {
			System.out.println(n + " IS NOT PRIME NUMBER");
		}
	}

}
