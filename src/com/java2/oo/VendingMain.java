package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.java2.oo.Drink;

public class VendingMain {

	public static void main(String[] args) {
	
		List<Drink> drinks = new ArrayList<>(); 
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		
		try {
			fr = new FileReader("vendingMachine.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(", ");
			int count = Integer.parseInt(tokens[0]);
			for(int i = 0; i < count; i++){
				String name = tokens[i*2+1];
				int price = Integer.parseInt(tokens[i*2+2]);
				vm.drinks.add(new Drink(i+1, name, price));
			}
			vm.on();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
