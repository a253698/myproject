package com.mavis.oo;

public class Student {

	private int english;
	// private封起來後，只能在自己這邊用

	protected int math;
	// package屬性，只能在同一個package裡面使用
	// protected 只給子類別和同package用。

	int chinese;
	// 屬性

	String name;
	static int pass = 60;
	// 變數
	// static只能抓取static的東西

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		// 屬性 變數
		// this代表本類別本人，
	}
	// 建構子

	public Student() {
	}

	public Student(String name) {
		this.name = name;
		// 強調，這裡面的東西。讓區域變數與屬性做區別。
	}

	public void print() {
		// void 代表執行過後不回傳
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public static void method() {
		System.out.println("hello!");
	}
	// 方法

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
