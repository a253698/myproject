package com.mavis;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		System.out.println("請輸入你的年紀");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		//把 string 轉成 int
		if (age < 7){
			System.out.println("讀幼兒園嗎?");
		}else
			if(age < 12){
			System.out.println("讀國小嗎?");
			}
			else 
				if(age < 15){
					System.out.println("讀國中嗎?");
				}
		
	}

}
