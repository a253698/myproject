package com.mavis.oo;

public class Student {

	int english;
	int math;
	int chinese;
	String name;

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public Student(String name) {
		this.name = name;
		// 強調，這裡面的東西。讓區域變數與屬性做區別。
	}

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}