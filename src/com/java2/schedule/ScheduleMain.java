package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ScheduleMain {

	/*
	 * 有一文字檔儲存了課表資料(schedule.txt) 請讀取資料後，設計程式可檢查是否有空檔? 如: 請輸入星期(1-7):2
	 * 請輸入時(0-24):11 【有空檔】 請輸入星期(1-7):4 請輸入時(0-24):14 【有課: C004 English 到 16時 】
	 */

	public static void main(String[] args) {
		new ScheduleMain();
	}
  
	FileReader fr;

	public ScheduleMain() {
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String tokens[] = line.split(",");
			// String schedule = tokens[0];
			String classorder = tokens[0];
			String classname = tokens[1];
			int day = Integer.parseInt(tokens[2]);
			int classtime = Integer.parseInt(tokens[3]);
			int hour = Integer.parseInt(tokens[4]);
			Schedule s = new Schedule(classorder, classname, day, classtime, hour);
			
			List<String> classorder1 =  new ArrayList<>();
			List<String> classname1 =  new ArrayList<>();
			List<Integer> day1 =  new ArrayList<>();
			List<Integer> classtime1 =  new ArrayList<>();
			List<Integer> hour1 =  new ArrayList<>();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	class Schedule {
		String classorder;
		String classname;
		int day;
		int classtime;
		int hour;
		
		public Schedule(String classorder, String classname, int day, int classtime, int hour) {
			this.classorder = classorder;
			this.classname = classname;
			this.day = day;
			this.classtime = classtime;
			this.hour = hour;
		}

		public String getClassorder() {
			return classorder;
		}

		public void setClassorder(String classorder) {
			this.classorder = classorder;
		}

		public String getClassname() {
			return classname;
		}

		public void setClassname(String classname) {
			this.classname = classname;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getClasstime() {
			return classtime;
		}

		public void setClasstime(int classtime) {
			this.classtime = classtime;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}
	}
}
