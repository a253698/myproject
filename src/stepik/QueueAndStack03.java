package stepik;

import java.util.Stack;

public class QueueAndStack03 {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		stack.add("3");
		stack.add("1");
		stack.add("2");
		stack.add("3");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
