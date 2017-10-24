package com.mavis;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = 69.5f; 
		char c = 65; 
		char c2 = 'Z';
		
		
		int i = c2;
		System.out.println(i);
		//System.out.println((int)c2);
		boolean pass = true;
		System.out.println(!pass);
		System.out.println(pass);
	
		String s = new String ("Hello");
		int len = s.length();
		//算出s有多少字(char)
		System.out.println(s.charAt(0));
		//java排序 0 1 2 3 從0開始為第一個
		
		String s2 = "HAHAHAHA";
		//String s2 = "HAHAHAHA"; = String s2 = new String ("HAHAHAHA");
		//字串=一個個個個個字元
		
		
		System.out.println("len:"+len);
		
		//字串形態 string 
		System.out.println(s);
		Random r = new Random();
		//亂數 random 
		 
		int n1 = r.nextInt(6)+1;
		
		System.out.println(n1);
		
		System.out.println(3 == 2);
		
		//變數 age weight c c2 i pass s r n1
		//變數型  byte short int long 
		//參照資料型態 s r 
		
	}

}
