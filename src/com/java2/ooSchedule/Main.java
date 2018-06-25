package com.java2.ooSchedule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	FileReader fr;
	List<Classes> cl = new ArrayList<>();

	public static void main(String[] args) {
	
	}
	
	public Main() {
		fr = new FileReader("schedule.txt");
		BufferedReader in = new BufferedReader(fr);
	}

}
