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
		//��Xs���h�֦r(char)
		System.out.println(s.charAt(0));
		//java�Ƨ� 0 1 2 3 �q0�}�l���Ĥ@��
		
		String s2 = "HAHAHAHA";
		//String s2 = "HAHAHAHA"; = String s2 = new String ("HAHAHAHA");
		//�r��=�@�ӭӭӭӭӦr��
		
		
		System.out.println("len:"+len);
		
		//�r��κA string 
		System.out.println(s);
		Random r = new Random();
		//�ü� random 
		 
		int n1 = r.nextInt(6)+1;
		
		System.out.println(n1);
		
		System.out.println(3 == 2);
		
		//�ܼ� age weight c c2 i pass s r n1
		//�ܼƫ�  byte short int long 
		//�ѷӸ�ƫ��A s r 
		
		
		float f = 5.0f;
		int x = 5;
		int y = 3;
		int z = (int)(f / y);
		//�@�p��p���[����䪺��ƫ��A
		float w = x / y ;
		// /=���k %=�l��		
		System.out.println(z);
		System.out.println(w);
		
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		// ���M=�@�_�X�{�����b�k�� 
		// ||=��  &&=�B
		
		System.out.println(x << 2);
		// X�V�������bit
		
		System.out.println(x);
		x = x + 1;
		// x=x+1  =  x==
		// x=x-1  =  x--
		
		System.out.println(x);
		
		x += 2;
		//x=x+2  =  x += 2 
		System.out.println(x);
		
		
	}

}
