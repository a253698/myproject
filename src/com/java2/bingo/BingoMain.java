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
			String line2 = in.readLine();
			String tokens2[] = line2.split(",");
			List<Integer> ans = new ArrayList<>();
			for (int i = 1; i <= tokens2.length; i++) {
				int j = Integer.parseInt(tokens2[i]);
				ans.add(j);
			}
			List<Integer> bingo = new ArrayList<>();
			for (int n = 1; n <= bingochart; n++) {
				bingo.add(n);
			}
			Collections.shuffle(bingo);

			for (int m = 1; m <= bingochart; m++) {
				System.out.print(bingo.get(m) + "\t");
				if (m % 5 == 0) {
					System.out.println();
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
