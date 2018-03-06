package com.java2.object;

import java.util.Random;

public class MiddleTicket extends NormalTicket {

	int Middleticketnumbers = (temp / 500);

	public MiddleTicket(int temp, int Middleticketnumbers) {
		super(temp, Middleticketnumbers);
	}

	@Override
	public void print() {
		int b = -1;
		while (b != 0) {
			for (int k = 1; k <= Middleticketnumbers; k++) {

				Random r = new Random();
				int w1 = r.nextInt((7) + 1);
				System.out.print(w1 + "\t");
			}
			b = 0;
			System.exit(0);
		}
	}
}
