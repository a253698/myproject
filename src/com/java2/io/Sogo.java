package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Sogo {

	public Sogo() {

	}

	public void inputSales() {
		try {
			FileOutputStream out = new FileOutputStream("SalesData.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void start(){
		showFunctions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入功能1~3");
		int function = scanner.nextInt();
		while(function !=  3){
			switch(function){
		case 3;
		return;
		}
		}
	}

	public static void main(String[] args) {

	}

	public void showFunctions() {
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印書銷售報表");
		System.out.println("3結束程式");
	}

}
