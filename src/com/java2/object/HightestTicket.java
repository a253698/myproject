package com.java2.object;

import java.util.Random;

public class HightestTicket extends NormalTicket{
	
	int ticketnumbers = (amount / 1000);

	public HightestTicket(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		Random r = new Random();
		int a = -1;
		while (a != 0) {
			int n1 = r.nextInt((10) + 1);
			

			for(int k = 0;k <= ticketnumbers; k++){
				System.out.println(n1);
			}
			a = 0;

		}
	}

}
