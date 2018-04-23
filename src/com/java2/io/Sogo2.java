package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.nio.channels.ShutdownChannelGroupException;

import com.java2.io.Sales;
import com.mavis.shopping.Customer;
import com.mavis.shopping.GoldenCustomer;
import com.mavis.shopping.SilverCustomer;

public class Sogo2 {
	Scanner scanner = new Scanner(System.in);

	public Sogo2() {

	}

	public static void main(String[] args) {
		Sogo2 sogo = new Sogo2();
		sogo.start();
	}

	public void inputSales2() {
		try {
			OutputStream fos = new FileOutputStream("Sogo2SalesData.txt");
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int level = scanner.nextInt();
			System.out.print("請輸入消費金額:");
			int price = scanner.nextInt();
			out.print(level + "\t" + price);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunctions();
			function = scanner.nextInt();
			switch (function) {
			case 1:
				inputSales();
				break;

			case 2:
				ArrayList<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("Sales2.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					// FileInputStream 和 BufferedReader 的連接橋梁
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type, amount);
							list.add(sales);
						} catch (NumberFormatException e) {
							System.out.println("資料的格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// report
				for (Sales sales : list) {
					Customer customer = null;
					switch (sales.getType()) {
					case 1:
						customer = new Customer(sales.getAmount());
						break;
					case 2:
						customer = new SilverCustomer(sales.getAmount());
						break;
					case 3:
						customer = new GoldenCustomer(sales.getAmount());
						break;
					}
					customer.print();
				}

				break;

			case 3:
				return;
			}
		}
	}

	public void inputSales() {
		try {
			FileOutputStream fos = new FileOutputStream("Sales2.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int type = scanner.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = scanner.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showFunctions() {
		System.out.println("請輸入功能1~3");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印書銷售報表");
		System.out.println("3結束程式");
	}

}
