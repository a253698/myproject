package com.mavis;

public class PracticInHome4Niner {

	public static void main(String[] args) {
		for (int n = 1 ; n <= 9 ; n++){
			for (int i = 1; i <= 9 ; i++){
				if ((n * i)<10) {
				System.out.println(n + " x " + i + " =  " + (n * i) );
				}
				else{
				System.out.println(n + " x " + i + " = " + (n * i));	
				}
					
				
			}
			System.out.println(); 
		}
	}

}
