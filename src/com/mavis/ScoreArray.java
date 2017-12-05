package com.mavis;

public class ScoreArray {

	public static void main(String[] args) {
		
		int score [][] = new int [5][3];
		score[0][0] = 11;
		score[0][1] = 11;
		score[0][2] = 11;
		score[1][0] = 22;
		score[1][1] = 22;
		score[1][2] = 22;
		score[2][0] = 33;
		score[2][1] = 33;
		score[2][2] = 33;
		score[3][0] = 44;
		score[3][1] = 44;
		score[3][2] = 44;
		score[4][0] = 55;
		score[4][1] = 55;
		score[4][2] = 55;
		
		for (int n = 0; n < 5; n++){
			System.out.print(score[n][0]+"\t"+score[n][1]+"\t"+score[n][2]+"\t");
			int average = (score[n][0]+score[n][1]+score[n][2])/3;
			if (average < 60){
				System.out.println(average+"*");
			}else{
				System.out.println(average);
			}
			
		}  
	}

}
