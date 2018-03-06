package com.java2.object;

import java.util.ArrayList;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int n1 = 0;
		int n2 = 0;
		int temp = 0;
		int ticketnumbers = 0;
//		int Middleticketnumbers = 0;
//		int Hightestticketnumbers = 0;
		
		if (n <= 1000) {
			System.out.println("一般抽獎卷");
			temp = n;
			ticketnumbers = (n / 250);
		} else {
			if (n <= 5000 || n > 1000) {
				System.out.println("中級抽獎卷");
				temp = n;
				n = n1;
				n1 = temp;
			} else {
				System.out.println("高級抽獎卷");
				temp = n1;
				n1 = n2;
				n2 = temp;
			}
		}
		NormalTicket p1 = new NormalTicket(temp,ticketnumbers);
		p1.print();
//		MiddleTicket p2 = new MiddleTicket(temp,Middleticketnumbers);
//		p2.print();
//		HightestTicket p3 = new HightestTicket(temp,Hightestticketnumbers);
//		p3.print();
	}

}
