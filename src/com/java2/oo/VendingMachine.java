package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	int A = 25;
	int B = 30;
	int C = 20;
	int total = 0;
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("Please insert coins...");
		for(int n = 0; n <drinks.size(); n++){
			Drink drink = drinks.get(n);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = -1;
		while(data != 0){
			
			System.out.println("請投幣或選擇飲料(a:Coke 或 b:Orange Juice 或 c:Sprite),或輸入0結束:");
			System.out.println("販賣機餘額 : "  + total );
			String line = scanner.nextLine();
			
			switch(line){
			
			case "5":
				System.out.println("投入五元");
				total = total + 5;
				break;
				
			case "10":
				System.out.println("投入十元");
				total = total + 10;
				break;
				
			case "15":
				System.out.println("投入十五元");
				total = total + 15;
				break;
				
			case "a":
				System.out.println("選擇飲料A:Coke");
				if((total - A)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (total - A));
					total = total - A ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;
				
			case "b":
				System.out.println("選擇飲料B:Orange Juice");
				if((total - B)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (total - B));
					total = total - B ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;	
				
			case "c":
				System.out.println("選擇飲料C:Sprite");
				if((total - C)>0){
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + (total - C));
					total = total - C ;
				}else{
					System.out.println("BEEP! 餘額不足!");
				}
				break;
				
			case "0":
				System.out.println("End");
				break;
			}
		}
		
	}

}
