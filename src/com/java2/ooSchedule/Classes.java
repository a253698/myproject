package com.java2.ooSchedule;

public class Classes {

		String ClassName;
		String ClassNo;
		int day;
		int time;
		int starttime;
		
		public Classes(String ClassName, String ClassNo,int day,int time,int starttime) {
			this.ClassName = ClassName;
			this.ClassNo = ClassNo;
			this.day = day;
			this.time = time;
			this.starttime = starttime;
		}
		
		public boolean isOk(int askday,int asktime) {
			boolean ok = true;
			if(askday == this.day) {
			if (asktime >= this.starttime && asktime <= (this.starttime + this.time))
				return false;
			}
			return ok;
		}
		
		public String getClassName() {
			return ClassName;
		}
		public void setClassName(String className) {
			ClassName = className;
		}
		public String getClassNo() {
			return ClassNo;
		}
		public void setClassNo(String classNo) {
			ClassNo = classNo;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		public int getStarttime() {
			return starttime;
		}
		public void setStarttime(int starttime) {
			this.starttime = starttime;
		}
		
		
	
}
