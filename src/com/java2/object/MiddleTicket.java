package com.java2.object;

import java.util.Random;

public class MiddleTicket extends NormalTicket {
	int Middleticketnumbers = (temp / 500);
	private int count = 0;
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
				if (w1 == 0) {
					count++;
				}
			}
			b = 0;
			// System.exit(0);
		}
	}
	public void allgifted() {
		int v = -1;
		while (v != 0) {
			for (int k = 1; k <= Middleticketnumbers; k++) {
				Random r = new Random();
				int w1 = r.nextInt((7) + 1);
				System.out.print(w1 + "\t");
				if (w1 == 0) {
					count++;
				}
				v = 0;
			}
		}
	}
}
