package com.java2.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Sogo {
	Scanner scanner = new Scanner(System.in);
	

	public Sogo() {

	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}

	public void inputSales() {
		try {
			OutputStream fos = new FileOutputStream("SalesData.txt");
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int level = scanner.nextInt();
			System.out.print("請輸入消費金額:");
			int price = scanner.nextInt();
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void start(){
		int function = 0;
		while(function != 3){
			showFunctions();
			function = scanner.nextInt();
			switch(function){
			case 1:
			inputSales();
			break;
			
			case 2:
			break;
			
			case 3:
		return;
		}
		}
	}

	public void showFunctions() {
		System.out.println("請輸入功能1~3");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印書銷售報表");
		System.out.println("3結束程式");
	}

}
