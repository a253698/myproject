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
		new ScheduleMain();
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
			}

			int function = -1;
			while (function != 0) {
				System.out.println("請輸入星期(1-7):");
				Scanner scannerWeek = new Scanner(System.in);
				String scanner01 = scannerWeek.nextLine();
				int sWeek = Integer.parseInt(scanner01);
				System.out.println("請輸入時間(0-24):");
				Scanner scannerTime = new Scanner(System.in);
				String scanner02 = scannerTime.nextLine();
				int sTime = Integer.parseInt(scanner02);
				switch (sWeek) {
				case 1:
					if (sTime >= Integer.parseInt(class03.get(3)) && sTime <= (Integer.parseInt(class03.get(3))+Integer.parseInt(class03.get(4)))) {
						System.out.println("[有課]" + "  " + "Class:" + class03.get(0) + "  " + "Name:" + class03.get(1));
					} else {
						System.out.println("[沒課]");
					}
				case 2:
					if (sTime >= Integer.parseInt(class01.get(3)) && sTime <= (Integer.parseInt(class01.get(3))+Integer.parseInt(class01.get(4)))) {
						System.out.println("[有課]" + "  " + "Class:" + class01.get(0) + "  " + "Name:" + class01.get(1));
					} else {
						System.out.println("[沒課]");
					}

				case 3:
					System.out.println("[沒課]");

				case 4:

					if (sTime >= Integer.parseInt(class02.get(3)) && sTime <= (Integer.parseInt(class02.get(3))+Integer.parseInt(class02.get(4)))) {
						System.out.println("[有課]" + "  " + "Class:" + class02.get(0) + "  " + "Name:" + class02.get(1));
					} else {
						if (sTime >= Integer.parseInt(class04.get(3)) && sTime <= (Integer.parseInt(class04.get(3))+Integer.parseInt(class04.get(4)))) {
							System.out.println(
									"[有課]" + "  " + "Class:" + class04.get(0) + "  " + "Name:" + class04.get(1));
						} else {
							System.out.println("[沒課]");
						}
					}

				case 5:
					System.out.println("[沒課]");

				case 6:
					System.out.println("[沒課]");

				case 7:
					System.out.println("[沒課]");

				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {

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
