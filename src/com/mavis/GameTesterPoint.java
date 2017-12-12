package com.mavis;

import java.util.Scanner;

public class GameTesterPoint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = -1;
		int hp = 100;
		int row = 3; 
		int column = 5;
		int pos = 0;
		
		while (hp > 0) {
			System.out.println("2:向上 4:向左 8:向上 6:向右")
			System.out.print("請輸入方向:");
			String line = scanner.nextLine();
			//scan到的轉成string
			a = Integer.parseInt(line);
			switch (a) {
			case 2:
				if(pos/column < row-1 ){
					pos = pos + column;
					hp = hp - 5;
				}else{
					hp = hp - 30;
				}
				System.out.println("向下");
				System.out.println(hp);
				break;
				
			case 4:
				if(pos%column == 0){
					hp = hp - 30;
				}else{
					hp = hp - 5;
				}
				System.out.println("向左");
				System.out.println(hp);
				break;
				
			case 8:
				if(pos/column == 0){
					pos = pos - column;
					hp = hp - 5;
				}else{
					hp = hp - 30;
				}
				System.out.println("向上");
				System.out.println(hp);
				break;
				
			case 6:
				if(pos%column == 4){
					hp = hp -30;
				}else{
					hp = hp - 5;
				}
				System.out.println("向右");
				System.out.println(hp);
				break;
			case 0:
				System.out.println("遊戲結束!");
				break;
			}
		}
	}
}
