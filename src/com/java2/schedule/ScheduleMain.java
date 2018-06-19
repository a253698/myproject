package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ScheduleMain {

	public static void main(String[] args) {
		ScheduleMain sm = new ScheduleMain();
		sm.start();
	}
	
	FileReader fr;
	
	public ScheduleMain() {
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			
			String line = in.readLine();
			String tokens01[] = line.split(",");
			List<String> class01 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens01[i]);
			}
			
			line = in.readLine();
			String tokens02[] = line.split(",");
			List<String> class02 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens02[i]);
			}
			
			line = in.readLine();
			String tokens03[] = line.split(",");
			List<String> class03 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens03[i]);
			}
			
			line = in.readLine();
			String tokens04[] = line.split(",");
			List<String> class04 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens04[i]);
				
			
				int function = -1;
				while(function != 0){
					System.out.println("請輸入星期(1-7):");
					Scanner scannerWeek = new Scanner(System.in);
					int sWeek = scannerWeek.nextInt();
					System.out.println("請輸入時間(0-24):");
					Scanner scannerTime = new Scanner(System.in);
					String sTime = scannerTime.nextLine();
					switch(sWeek){
					case 1:
					if(sTime = ){
						
					}
					case 2:
						
					case 3:
						
					case 4:
						
					case 5:
						
					case 6:
						
					case 7:

					}
					
				}	
			
			}
			
//			System.out.println("請輸入星期:");
//			Scanner scannerWeek = new Scanner(System.in);
//			String sweek = scannerWeek.nextLine();
//			
//			System.out.println("請輸入時間");
//			Scanner scannerTime = new Scanner(System.in);
//			String stime = scannerTime.nextLine();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		
	}
	
	class Schoolclasses {
		List<String> class01;
		List<String> class02;
		List<String> class03;
		List<String> class04;

		public Schoolclasses(List<String> class01, List<String> class02, List<String> class03, List<String> class04) {
			this.class01 = class01;
			this.class02 = class02;
			this.class03 = class03;
			this.class04 = class04;
		}
	}

}
