import java.util.Random;

public class Poker {

	public static void main(String[] args) {
		Random r = new Random();
		
		String flowers = "♠♥♦♣";
		int[] cards = new int[52];
		for(int i = 0 ; i < cards.length; i++){
			cards[i] = i;
			System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
		}
	}

}
