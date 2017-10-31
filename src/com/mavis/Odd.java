package com.mavis;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		//Scanner 接收資料 掃描資料  System.in = 鍵盤鎖打入的字 
		
		String line = scanner.nextLine();
		//取的輸入字命名為line，按enter後表示輸入完成
		
		int n = Integer.parseInt(line);
		//將line字串轉型成整數n
	
		if (n % 2 == 1){
			System.out.println("是奇數");
		}
		else {System.out.println("是偶數");
		}
	}

}
