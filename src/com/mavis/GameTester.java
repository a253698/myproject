package com.mavis;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = -1;
		while (a != 0) {
			System.out.print("請輸入方向:");
			String line = scanner.nextLine();
			//scan到的轉成string
			a = Integer.parseInt(line);
			switch (a) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 6:
				System.out.println("向下");
				break;
			case 0:
				System.out.println("遊戲結束!");
				break;
			}
		}
	}
}
