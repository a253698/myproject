package com.java2.game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.java2.oo.Drink;

public class MazeMain {
	
	FileReader fr;
	
	public MazeMain(){
		
		try {
			
			fr = new FileReader("Maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String tokens[] = line.split(",");
			int column = Integer.parseInt(tokens[0]);
			int row =  Integer.parseInt(tokens[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(tokens[0]);
			/**/
			int moves = Integer.parseInt(tokens[0]);
			for(int i = 0; i < moves; i++){
//				int move = 
			}
			/**/
			Maze m = new Maze(column, row, trapCount);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MazeMain();
	}
	
	class Maze{
		int row, column;
		int trapCount;
		int[] traps;
		Player player;
		
		public Maze(int column, int row, int trapCount){
			this.column = column;
			this.row = row;
			this.trapCount = trapCount;
		}
	}
	
	class Player{
		int hp = 100;
		int postition = 0;
	}

}
