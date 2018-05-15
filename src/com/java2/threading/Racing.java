package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		
		List<Horse> horses = new ArrayList<>();
		for(int n = 0; n <8; n++){
			Horse h = new Horse();
			horses.add(h);
			h.start();
			
		}
		
		
		/*Horse h1 = new Horse();
		Horse h2 = new Horse();
		
		h1.start();
		h2.start();*/

	}

}
