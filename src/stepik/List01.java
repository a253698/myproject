package stepik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		
		 Stack<Integer> stack = new Stack<Integer>();
		System.out.print("type:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		
		stack.push(n);

		List<Integer> list = new ArrayList<Integer>(n);

		if (n % 2 == 0) {
			for (Integer x : list) {
				System.out.println(n);
			}
		}
	}
}
// if(n % 2 == 0) {
// System.out.print(n);
// }
//
// }
//
// }
