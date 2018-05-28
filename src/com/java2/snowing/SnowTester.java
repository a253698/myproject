package com.java2.snowing;

import java.util.ArrayList;
import java.util.List;
import java.awt.Canvas;


//Quiz; 設計SNOW類別代表一顆雪X,Y,Thread飄降落

public class SnowTester {

	public static void main(String[] arges) {
		List<Snow> snows = new ArrayList<>();
		for (int n = 0; n < 150; n++) {
			Canvas canvas = null;
			Snow snow = new Snow(canvas);
			snow.start();
			snows.add(snow);
		}
	}

}
