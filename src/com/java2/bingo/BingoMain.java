package com.java2.bingo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMain {

	FileReader fr;


	public static void main(String[] args) {
		new BingoMain();
	}

	public BingoMain() {
		try {
			fr = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			int bingochart = Integer.parseInt(line);
			int chartrow = (int) Math.sqrt(bingochart);
			line = in.readLine();
			String tokens[] = line.split(",");
			List<Integer> ans = new ArrayList<Integer>();
			for (int i = 0; i <= tokens.length - 1; i++) {
				int a = Integer.parseInt(tokens[i]);
				ans.add(a);
			}
			
			
			BingoChart bc = new BingoChart(bingochart, chartrow, ans, tokens);
			bc.PrintChart();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
