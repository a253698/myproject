package com.java2.object;

import java.util.Random;

public class MiddleTicket extends NormalTicket {
	
	int ticketnumbers = (amount / 500);

	public MiddleTicket(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		Random r = new Random();
		int a = -1;
		while (a != 0) {
			int n1 = r.nextInt((7) + 1);
			int n2 = r.nextInt((7) + 1);
			int n3 = r.nextInt((7) + 1);
			int n4 = r.nextInt((7) + 1);

			for(int k = 0;k <= ticketnumbers; k++){
				System.out.println(n1);
			}
			a = 0;

		}
	}

	}

