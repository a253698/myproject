package com.java2.object;

import java.util.ArrayList;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();

		int n = Integer.parseInt(line);
		int n1;
		int n2;

		if (n < 1000) {
			System.out.println("一般抽獎卷");
		} else {
			if (n < 5000 || n > 1000) {
				System.out.println("中級抽獎卷");
				
				int temp = n;
				n = n1 ;
				n1 = temp;
			} else {
				System.out.println("高級抽獎卷");
				
				int temp = n1;
				n1 = n2 ;
				n2 = temp;
				
			}
		}
		
		NormalTicket p1 = new NormalTicket(n);
		p1.print();

		MiddleTicket p2 = new MiddleTicket(n1);
		p2.print();

		HightestTicket p3 = new HightestTicket(n2);
		p3.print();
	}



}




