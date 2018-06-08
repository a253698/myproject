package com.java2.game;

public class Maze {
	
	/*
	Map(4*6)
	Trap(cannot same) use List(same) use Set(no same)
	Player site, move(up down left right)
	How to put Maze Player together -> put player in Map?
	*/
	
	/*
	 * 6,4
	 * 5
	 * 6,8,2,4,2,2,6,6,8,4,2,2,6
	 * 
	 * */
	
	/*
	 * 
	 * 1  2  3  4  5  6
	 * 7  8  9 10 11 12
	 *13 14 15 16 17 18
	 *19 20 21 22 23 24 
	 * 
	 * */
	
	/*
	 * 有一遊戲場地，長寬由執行時決定，場地中亂數產生陷阱，陷阱數也由當時才決定
	 * 
	 * 有一個玩家在這場地中，初始PH值為100，走一步消耗1HP，撞到邊界扣5HP，掉到陷阱扣20HP
	 * 
	 * 有個檔案(maze.txt)資訊如下：
	 * 6,4
	 * 5
	 * 6,8,2,4,2,2,6,6,8,4,2,2,6
	 */
	
}
