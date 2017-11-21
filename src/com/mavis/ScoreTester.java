package com.mavis;

public class ScoreTester {

	public static void main(String[] args) {
		int score = 66;
		int a = score/10;
		switch(a){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10:
			System.out.println("Excellent");
			break;
		}
	}

}
