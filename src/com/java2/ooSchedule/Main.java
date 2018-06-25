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

	public Main() {
		readFile();
		// ask();
		// reply();

		Scanner scanner = new Scanner(System.in);
		System.out.println("please type in day :");
		int askday = scanner.nextInt();
		System.out.println("please type in hour :");
		int askstarttime = scanner.nextInt();
		boolean ok = true;
		for (Classes cla : cl) {
			if (!cla.isOk(askday, askstarttime)) {
				System.out.println("有課  邊號:" + cla.getClassNo() + " 課名:" + cla.ClassName);
				ok = false;
				break;
			}
		}if(ok) {
			System.out.println("沒課");
		}
	}

	public void readFile() {
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			for (int a = 0; a == 4; a++) {
				String tokens[] = line.split(",");
				String ClassNo = tokens[0];
				String ClassName = tokens[1];
				int day = Integer.parseInt(tokens[2]);
				int time = Integer.parseInt(tokens[3]);
				int starttime = Integer.parseInt(tokens[4]);
				Classes classes = new Classes(ClassName, ClassNo, day, time, starttime);
				cl.add(classes);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ask() {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("please type in day :");
		// int askday = scanner.nextInt();
		// System.out.println("please type in hour :");
		// int askstarttime = scanner.nextInt();
	}

	public void reply() {
		// if (askday == day) {
		// if (askstarttime >= starttime && askstarttime <= (starttime + time)) {
		// System.out.println("有課" + );
		// }else {
		// System.out.println("沒課");
		// }
		// }
	}

	public static void main(String[] args) {
		new Main();
	}

}
