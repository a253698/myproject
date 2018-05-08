package stepik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {
		System.out.println("Sample Input:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);

		String[] token = line.split(" ");


		if (n % 2 == 1) {
			System.out.println(n);
		} 
	}

}
