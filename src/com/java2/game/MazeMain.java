package com.java2.game;

public class MazeMain {
	
	public MazeMain(){
		
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
