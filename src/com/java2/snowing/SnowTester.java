package com.java2.snowing;

import java.util.ArrayList;
import java.util.List;

//Quiz; 設計SNOW類別代表一顆雪X,Y,Thread飄降落

public class SnowTester {

	public static void main(String[] arges) {
		List<Snow> snows = new ArrayList<>();
		for (int n = 0; n < 10; n++) {
			Snow snow = new Snow();
			snow.start();
			snows.add(snow);
		}
	}

}
