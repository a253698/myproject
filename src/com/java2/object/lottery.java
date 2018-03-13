package com.java2.object;

import java.util.ArrayList;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		System.out.println("抽獎卷分為三種等級，1~4為一般抽獎卷所得獎，5~7為中級抽獎卷所得獎，7~9為高級抽獎卷所得獎，0號為銘謝惠顧。");
		System.out.println("中級抽獎卷與高級抽獎眷對顧客將有特別回饋。持有這兩種抽獎卷者不會抽到銘謝惠顧，絕對票票有獎。");
		
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int n1 = 0;
		int n2 = 0;
		int temp = 0;
		int ticketnumbers = 0;
		int Middleticketnumbers = 0;
		int Hightestticketnumbers = 0;
		
//		int count = 0;

		if (n <= 1000) {
			System.out.println("一般抽獎卷");
			temp = n;
			ticketnumbers = (n / 250);

			NormalTicket p1 = new NormalTicket(temp, ticketnumbers);
			p1.print();

		} else {
			if (n <= 5000 && n > 1000) {
				System.out.println("中級抽獎卷");
				temp = n;
				n = n1;
				n1 = temp;
				Middleticketnumbers = (n1 / 500);

				MiddleTicket p2 = new MiddleTicket(temp, Middleticketnumbers);
				p2.print();
				p2.allgifted();

			} else {
				System.out.println("高級抽獎卷");
				temp = n;
				n = n2;
				n2 = temp;
				Hightestticketnumbers = (n2 / 1000);

				HightestTicket p3 = new HightestTicket(temp, Hightestticketnumbers);
				p3.print();
				p3.allgifted();
				
			}
		}
	}
}
