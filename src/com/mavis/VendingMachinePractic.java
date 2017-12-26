package com.mavis;

import java.util.Scanner;

public class VendingMachinePractic {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = 1;
		int money = 0;
		int A = 15;
		int B = 20; 
		int C = 30;
		
		
		while (n > 0) {
			System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
			System.out.println("販賣機餘額 : "  + money );
			String line = scanner.nextLine();
			
			switch (line) {
			case "5":
				System.out.println("投入五元");
				money = money + 5;
				break;
				
			case "10":
				System.out.println("投入十元");
				money = money + 10;
				break;
				
			case "15":
				System.out.println("投入十五元");
				money = money + 15;
				break;
				
			case "a":
				System.out.println("選擇飲料A");
				if((money - A)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (money - A));
					money = money - A ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;
				
			case "b":
				System.out.println("選擇飲料B");
				if((money - B)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (money - B));
					money = money - B ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;	
				
			case "c":
				System.out.println("選擇飲料C");
				if((money - C)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (money - C));
					money = money - C ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;
				
			case "0":
				System.out.println("結束!");
				n = -1 ;
				break;
			}
		}
	}
}