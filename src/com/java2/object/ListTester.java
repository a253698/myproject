package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		// 父類別:List 子類別:Arraylist

		cards.add(11);
		cards.add(22);
		cards.add(33);
		cards.add(44);

		System.out.println(cards.size());
		System.out.println(cards.get(2));
		System.out.println("Removing numbe :" + cards.remove(1));
		System.out.println(cards.size());
		System.out.println(cards.get(2));

		// System.out.println(cards.contains(3));

	}
}
