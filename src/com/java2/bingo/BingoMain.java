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
			String tokens[] = line.split(",");
			int bingochart = Integer.parseInt(tokens[0]);
			int chartrow = (int) Math.sqrt(bingochart);
			System.out.print(bingochart + " " + chartrow);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void PrintCard() {
	List<Integer> bingo = new ArrayList<>();
		
		for(int n = 1; n <= 25 ; n++) {
			bingo.add(n);
		}
//		System.out.print(bingo);
		Collections.shuffle(bingo);
//		System.out.print(bingo);
		
		for(int m = 1; m <= 25 ; m++ ) {
			System.out.print(bingo.get(m) + "\t");
			if( m % 5 == 0) {
				System.out.println();
			}
			
		}
			
	}
	

}
