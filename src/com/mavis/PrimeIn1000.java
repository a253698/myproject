package com.mavis;

public class PrimeIn1000 {

	public static void main(String[] args) {
		boolean prime = true;
		for (int n = 2; n <= 1000; n++) {
			for (int i = 2; i < n; i++)
				if (n % i == 0) {
					prime = false;
					break;
				}
		
			if (prime) {
				System.out.println(n);
				break;
			}
		}
	}
	}

