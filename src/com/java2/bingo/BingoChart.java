package com.java2.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoChart {

	int bingochart;
	int chartrow;
	List<Integer> ans;
	String[] tokens;

	public BingoChart(int bingochart, int chartrow, List<Integer> ans, String[] tokens) {
		this.bingochart = bingochart;
		this.chartrow = chartrow;
		this.ans = ans;
		this.tokens = tokens;
	}

	public void PrintChart() {

		List<Integer> bingo = new ArrayList<>();
		for (int n = 1; n <= bingochart; n++) {
			bingo.add(n);
		}
		Collections.shuffle(bingo);

		System.out.println(bingo);
		System.out.println(ans);
		System.out.println(" ");

		// from anna
		for (int i = 0; i < bingochart; i++) {
			System.out.print(bingo.get(i) + "	");
			if (i % chartrow == 4) {
				System.out.println();
			}
		}

		System.out.println(" ");
		
	
		for (int e = 0; e < bingochart; e++) {
			for (int r = 0; r < tokens.length; r++) {
				if(bingo.get(e) == ans.get(r)) {
					bingo.set(bingo.get(e), 0);
				}
			}
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < bingochart; i++) {
			System.out.print(bingo.get(i) + "	");
			if (i % chartrow == 4) {
				System.out.println();
			}
		}
	}

	public String[] getTokens() {
		return tokens;
	}

	public void setTokens(String[] tokens) {
		this.tokens = tokens;
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
