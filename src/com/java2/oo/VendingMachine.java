package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

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
			data = scanner.nextInt();
			switch(data){
			case 0:
				System.out.println("End");
				break;
			}
		}
		
	}

}
