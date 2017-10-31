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
		//寫出W中的第一個字母
		
		String s2 = "HAHAHAHA";
		//String s2 = "HAHAHAHA"; = String s2 = new String ("HAHAHAHA");
		//字串=一個個個個個字元
		//String 為字串形態，等號右邊可以不加new		
		
		System.out.println("len:"+len);
		
		//字串 string 
		System.out.println(s);
		Random r = new Random();
		//亂數 random 
		 
		int n1 = r.nextInt(6)+1;
		
		System.out.println(n1);
		
		System.out.println(3 == 2);
		
		//變數 age weight c c2 i pass s r n1
		//變數型  byte short int long 
		//參照資料型態 s r 
		
		
		float f = 5.0f;
		int x = 5;
		int y = 3;
		int z = (int)(f / y);
		
		float w = x / y ;
		// /=除法 %=餘數		
		System.out.println(z);
		System.out.println(w);
		
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		// 假若出現等號 等號一定放在右邊
		// ||=或  &&=且
		
		System.out.println(x << 2);
		// x向右推一兩個bit
		
		System.out.println(x);
		x = x + 1;
		// x=x+1  =  x==
		// x=x-1  =  x--
		
		System.out.println(x);
		
		x += 2;
		//x=x+2  =  x += 2 
		System.out.println(x);
		
		String data = "123";
		int n = Integer.parseInt(data);
		//字串轉數字
		
		String mydata = String.valueOf(n);
		//整屬轉字串
		
	}

}
