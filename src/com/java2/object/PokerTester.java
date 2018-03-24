package com.java2.object;

import java.util.Random;

public class PokerTester {

	public static void main(String[] args) {

		String flowers = "♠♥♦♣";
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
		
	}

}
