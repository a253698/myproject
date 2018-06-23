package com.java2.bingo;

import java.util.ArrayList;
import java.util.List;

public class BingoMain {

	public static void main(String[] args) {
		new BingoMain();
		
	}
	
	public BingoMain() {
		PrintCard();
	}
	
	public void PrintCard() {
		List<Integer> bingo = new ArrayList<>();
		
		for(int n = 1; n <= 25 ; n++) {
			bingo.add(n);
		}
		System.out.print(bingo);
		
//		for (int i = 0; i < bingo.length - 1; i++) {
//			for (int j = i + 1; j < bingo.length; j++) {
//				System.out.println(i + " " + j);
//				if (bingo[i] > bingo[j]) {
//					int temp = bingo[i];
//					bingo[i] = bingo[j];
//					bingo[j] = temp;
//				}
//			}
	}
	

}
