package stepik;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		 
		List<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(4);
		
		System.out.println(list);
	}

}
