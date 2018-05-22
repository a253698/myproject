package stepik;

import java.util.ArrayDeque;
import java.util.Queue;

public class List01 {

	public static void main(String[] args) {

		// write your code here
		Queue<String> queue = new ArrayDeque<>();

		queue.add("2");
		queue.add("0");
		queue.add("1");
		queue.add("7");
		System.out.println(queue);

	}
}