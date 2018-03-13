package com.java2.object;

import java.util.Random;

public class HightestTicket extends NormalTicket {

	int Hightestticketnumbers = (temp / 1000);
	private int change = 0;

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
				if(e1 == 0) {
					change++;
				}
				
			}
			c = 0;
//			System.exit(0);
		}
		System.out.println(" ");
	}

	public void allgifted() {
		System.out.print("高級抽獎補助禮:");

		int b = -1;
		while (b != 0) {
			for (int k = 1; k <= change; k++) {

				Random r = new Random();
				int w1 = r.nextInt((6) + 4);
				System.out.print(w1 + "\t" );
			}
			b = 0;
		}

	}

}
