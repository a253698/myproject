package com.mavis;

import java.util.Scanner;

public class NewHello {
	
		public static void main(String[] arges){
			System.out.println("請輸入你的名字");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			System.out.println("Hello,  " +line);
			
			System.out.println("你幾歲?");
			line = scanner.nextLine();
			int age = Integer.parseInt(line);		
			System.out.println(age);
			System.out.println(age > 25);
			
		}

}
