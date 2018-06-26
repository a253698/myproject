package com.java2.snow;

import java.util.ArrayList;
import java.util.List;
import java.awt.Canvas;

//Quiz; 設計SNOW類別代表一顆雪X,Y,Thread飄降落

public class OddSnowTester {

	public static void main(String[] args) {

		List<OddSnow> snows = new ArrayList<>();
		for (int i = 0; i <100; i++) {
			OddSnow snow = new OddSnow();
			snow.start();
			snows.add(snow);
		}
	}

	
}