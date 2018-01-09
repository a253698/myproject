package com.mavis.shopping;

public class GoldenCustomer extends Customer {

	public GoldenCustomer(int amount) {
		super(amount);
		super.discount = 0.01f;
	}

	@Overwrite
	public void print() {
		int feedback = (int) (amount * 0.1);
		int total = (int) (amount * (1 - discount));
		System.out.println(amount + "\t " + total + "\t" + "Customer's Feedback :" + feedback);
	}
}
