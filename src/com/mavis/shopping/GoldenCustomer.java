package com.mavis.shopping;

public class GoldenCustomer extends Customer {

	public GoldenCustomer(int amount) {
		super(amount);
		super.discount = 0.01f;
	}

	public void printForGolden() {
		int feedback = (int) (amount * 0.1);
		System.out.print("Customer's Feedback :" + feedback);
	}
}
