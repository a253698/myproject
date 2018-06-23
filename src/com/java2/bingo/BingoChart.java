package com.java2.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoChart {

	int bingochart;
	int chartrow;
	List<Integer> ans;

	public BingoChart(int bingochart, int chartrow, List<Integer> ans) {
		this.bingochart = bingochart;
		this.chartrow = chartrow;
		this.ans = ans;
	}

	public void PrintChart() {

		List<Integer> bingo = new ArrayList<>();
		for (int n = 1; n <= bingochart; n++) {
			bingo.add(n);
		}
		Collections.shuffle(bingo);

		System.out.println(bingo);

		for (int m = 1; m <= bingochart; m++) {
			for (int k = 1; k <= 10; k++) {
				if (bingo.get(m) == ans.get(k)) {
					bingo.set(k, 0);
				}
			}
			System.out.print(bingo.get(m) + "\t");
			if (m % chartrow == 0) {
				System.out.println();
			}

		}

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
