package com.java2.object;

import java.util.Random;

public class NormalTicket {

	int amount;
	int ticketnumbers = (amount / 200);
	
	public NormalTicket(int amount) {
		this.amount = amount;
		
	}

	public void print() {
		Random r = new Random();
		int a = -1;
		while (a != 0) {
			int n1 = r.nextInt((4) + 1);
			int n2 = r.nextInt((4) + 1);
			int n3 = r.nextInt((4) + 1);
			int n4 = r.nextInt((4) + 1);

			for(int k = 0;k <= ticketnumbers; k++){
				System.out.println(n1);
			}
			a = 0;

		}
	}

}
