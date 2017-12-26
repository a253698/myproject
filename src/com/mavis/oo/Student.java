package com.mavis.oo;

public class Student {

	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	// static只能抓取static的東西

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public Student() {
	}

	public Student(String name) {
		this.name = name;
		// 強調，這裡面的東西。讓區域變數與屬性做區別。
	}

	public void print() {
		// viod 代表執行過後不回傳
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public static void method() {
		System.out.println("hello!");
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
