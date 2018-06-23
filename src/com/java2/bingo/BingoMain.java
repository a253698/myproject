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
	Integer X;

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
			List<Integer> ans = new ArrayList<>();
			for (int i = 1; i <= tokens.length; i++) {
				int j = Integer.parseInt(tokens[i]);
				ans.add(j);
			}
			List<Integer> bingo = new ArrayList<>();
			for (int n = 1; n <= bingochart; n++) {
				bingo.add(n);
			}
			Collections.shuffle(bingo);
			
			for (int m = 1; m <= bingochart; m++) {
				for (int k = 1; k <= tokens.length; k++) {
					if (bingo.get(m) == ans.get(k)) {
						bingo.set(k, X);
					}
				}
				System.out.print(bingo.get(m) + "\t");
				if (m % chartrow == 0) {
					System.out.println();
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		class Chart {
			int bingochart;
			int chartrow;
			List<Integer> ans;
			
			public Chart(int bingochart, int chartrow, List<Integer> ans) {
				this.bingochart = bingochart;
				this.chartrow = chartrow;
				this.ans = ans;
			}
			
			public int getBingochart() {
				return bingochart;
			}

			public void setBingochart(int bingochart) {
				this.bingochart = bingochart;
			}

			public int getChartrow() {
				return chartrow;
			}

			public void setChartrow(int chartrow) {
				this.chartrow = chartrow;
			}

			public List<Integer> getAns() {
				return ans;
			}

			public void setAns(List<Integer> ans) {
				this.ans = ans;
			}

			
		}
	}

}
