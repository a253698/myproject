package com.mavis;

public class PracticInHome2
{

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			for(int k = 10; k > i+1; k--)
		{
			System.out.print(" ");
		}
		for(int j = 0; j < i+1; j++)
		{
	 		System.out.print(" ✿  ");
		}	
		System.out.println("");
		}
}}
