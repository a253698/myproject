package com.java2.object;

import java.util.Random;

public class NormalTicket {

	int temp;
	int ticketnumbers;

	public NormalTicket(int temp, int ticketnumbers) {
		int help = (temp / 250);
		int j = 0;
		this.temp = temp;
		this.ticketnumbers = ticketnumbers;
		j = help;
		help = ticketnumbers;
		ticketnumbers = j;
	}
	public void print() {
		int a = -1;
		while (a != 0) {
			for (int k = 1; k <= ticketnumbers; k++) {
				Random r = new Random();
				int q1 = r.nextInt((4) + 1);
				System.out.print(q1 + "\t");
			}
			a = 0;
			System.exit(0);
			
		}
	}

}
