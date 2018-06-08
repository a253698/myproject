package com.java2.game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.java2.oo.Drink;

public class MazeMain {
	
	FileReader fr;
//	int hp = 100;
//	int pos = 0;
	
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
//			int moves = Integer.parseInt(tokens[0]);
//			for(int i = 0; i < moves; i++){
//			}
			/**/
			Maze m = new Maze(column, row, trapCount);
			Scanner scanner = new Scanner(System.in);
			int a = -1;
			while (m.player.hp > 0) {
				System.out.print("請輸入方向:");
				String lineline = scanner.nextLine();
				//scan到的轉成string
				a = Integer.parseInt(lineline);
				switch (a) {
				case 2:
					if(m.player.postition/column < row-1 ){
						m.player.postition = m.player.postition + column;
						m.player.hp = m.player.hp - 1;
					}else{
						m.player.hp = m.player.hp - 5;
						System.out.println("HIT!!");
					}
					System.out.println("向下");
					System.out.println(m.player.hp);
					break;
					
				case 4:
					if(m.player.postition%column != 0){
						m.player.postition = m.player.postition - 1;
						m.player.hp = m.player.hp - 1;
					}else{
						m.player.hp = m.player.hp - 5;
						System.out.println("HIT!!");
					}
					System.out.println("向左");
					System.out.println(m.player.hp);
					break;
					
				case 8:
					if(m.player.postition/column == 0){
						m.player.postition = m.player.postition - column;
						m.player.hp = m.player.hp - 1;
					}else{
						m.player.hp = m.player.hp - 5;
						System.out.println("HIT!!");
					}
					System.out.println("向上");
					System.out.println(m.player.hp);
					break;
					
				case 6:
					if(m.player.postition%column != column -1){
						m.player.postition = m.player.postition + 1;
						m.player.hp = m.player.hp -1;
					}else{
						m.player.hp = m.player.hp - 5;
						System.out.println("HIT!!");
					}
					System.out.println("向右");
					System.out.println(m.player.hp);
					break;
				case 0:
					System.out.println("遊戲結束!");
					break;
				}
			}
			
			
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

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

		public int getTrapCount() {
			return trapCount;
		}

		public void setTrapCount(int trapCount) {
			this.trapCount = trapCount;
		}

		public int[] getTraps() {
			return traps;
		}

		public void setTraps(int[] traps) {
			this.traps = traps;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}
	}
	
	class Player{
		int hp = 100;
		int postition = 0;
	}

}
