package stepik;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class List02 {

	public static void main(String[] args) {

	    Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));

	    //write your code here
	    queue.remove(1);
	    queue.remove(2);
	    queue.addLast(5);

	    System.out.println(queue);

	  }
	}