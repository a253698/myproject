package com.mavis.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("Alex", 55, 66, 77);
		Student stu2 = new Student("Max", 11, 22, 99);

		// Student stu1 = new Student("Alex");

		// stu.english = 55;
		// stu.math = 66;
		// stu.chinese = 77;

		stu1.pass = 50;

		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println("Alex : " + avg);
		Student.method();
		GratuateStudent gstu = new GratuateStudent();
		gstu.print();

	}
}
