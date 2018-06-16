package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
				class01.add(tokens01[i]);
			}
			
			line = in.readLine();
			String tokens03[] = line.split(",");
			List<String> class03 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens01[i]);
			}
			
			line = in.readLine();
			String tokens04[] = line.split(",");
			List<String> class04 = new ArrayList<>();
			for (int i = 0; i < tokens01.length; i++) {
				class01.add(tokens01[i]);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
