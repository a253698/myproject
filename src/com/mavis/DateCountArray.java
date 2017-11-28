package com.mavis;

public class DateCountArray {

	public static void main(String[] args) {

		int number = 90;
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i <= month.length; i++) {
			if (number <= month[i]) {
				System.out.println((i + 1) + "月" + number + "日");
				break;
			} else {
				number = number - month[i];
			}
		}
	}
}
