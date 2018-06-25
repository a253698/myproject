package com.java2.ooSchedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	FileReader fr;
	List<Classes> cl = new ArrayList<>();

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			for(int a = 0 ; a == 4 ;a++) {
				String tokens[] = line.split(",");
				String ClassNo = tokens[0];
				String ClassName = tokens[1];
				int day = Integer.parseInt(tokens[2]);;
				int time = Integer.parseInt(tokens[3]);;
				int starttime = Integer.parseInt(tokens[4]);;
				Classes classes = new Classes( ClassName, ClassNo, day, time, starttime);
				cl.add(classes);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		
	}
	
	public void ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please type in day");
		int askday = scanner.nextInt();
		System.out.println("please type in hour");
		int askhour = scanner.nextInt();
	}

}
