package com.java2.object;

import java.util.Random;

public class Poker {

	Random random = new Random();
	String flowers = "♠♥♦♣";
	int[] cards = new int[52];

	public Poker() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			// System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));

		}
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = random.nextInt(52);
			int tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
			// 第一張跟任何一張換，第二張跟任何一張再換。造成打亂。
		}
	}

	public void print() {
		for (int i = 0; i < cards.length; i++) {
			int a = cards[i];
			System.out.println((a % 13) + 1 + "" + (flowers.charAt(a / 13)));
		}
	}
}
// 打亂奇數排、打亂偶數排、寫出JQK、加上joker。
