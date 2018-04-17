package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {

	Random random = new Random();
	String flowers = "♠♥♦♣";
	
	List<Integer> cards = new ArrayList<>();

	public Poker2() {
		for (int i = 1; i < 54; i++) {
			cards.add(i);
		}
	}
		public void pokershuffle2() {
			for (int i = 0; i < 54; i++) {
				int j = random.nextInt(52);
				cards.set(i,j);
			}
		}
		
		public void pokerprint2() {
			for (int i = 0; i < 54; i++) {
				int a = cards.get(1);
				System.out.println((a % 13) + 1 + "" + (flowers.charAt(a / 13)));
			}
		}
	}

