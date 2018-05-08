package stepik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> numList = new ArrayList(scanner.nextInt());
		Integer[] Array = numList.toArray(new Integer[0]);
		
		System.out.println(numList);
	}

}
