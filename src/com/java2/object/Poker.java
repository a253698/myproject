package com.java2.object;

import java.util.Random;

public class Poker {

	Random r = new Random();
	String flowers = "♠♥♦♣";
	int[] cards = new int[52];

	public Poker() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));

		}
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int r = Random.nextInt(52);
			int tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}

	public void print() {
					for (int i=0;i<cards.length;i++) {
					int a= cards[i];
				System.out.println((a % 13) + 1 + "" + (flowers.charAt(a / 13)));
					}
	}
	}
