package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTester {

public static void main(String[] args) throws FileNotFoundException{
	PrintStream out = new PrintStream("newdata.txt");
	out.println("Mavis\tCustomer\t1000");
	out.println("Tom\tSilverCustomer\t5000");
	out.println("Wesly\tGoldnCustomer\t10000");
	out.flush();
	out.close();
	}
}