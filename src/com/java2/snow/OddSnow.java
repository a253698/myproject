package com.java2.snow;

import java.util.Random;

public class OddSnow extends Thread {

	Random random = new Random();
	int x;
	int y = 800;
	public OddSnow(){
		x = random.nextInt(600);
		this.y = y;	
	}
	
	@Override
	public void run() {
	  for(int i=800;i>0;i--){
//		  System.out.println(getName()+"("+x+","+y+")");
		  y=y-1;
		  x=x-(random.nextInt(3)-1);
		  System.out.print(new String(new char[x]).replace("\0"," "));
		  System.out.println("o");
	  }
	}

	
}
