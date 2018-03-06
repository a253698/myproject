package com.java2.object;

import java.util.Random;

public class HightestTicket extends NormalTicket {

	int Hightestticketnumbers = (temp / 1000);

	public HightestTicket(int temp, int Hightestticketnumbers) {
		super(temp, Hightestticketnumbers);
	}

	@Override
	public void print() {
		int c = -1;
		while (c != 0) {
			for (int k = 1; k <= Hightestticketnumbers; k++) {
				Random r = new Random();
				int e1 = r.nextInt((10) + 1);
				System.out.print(e1 + "\t");
			}
			c = 0;
			System.exit(0);
		}
	}

}
