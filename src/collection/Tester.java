package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public interface Tester {
	
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Mavis");
		set2.add("Hank");
		set2.add("Wesly");
		set2.add("Mavis");
		System.out.println(set2);

		Map<String, String> student = new HashMap<>();
		student.put("02", "鐘明");
		student.put("03", "亣明");
		student.put("01", "曉明");
		System.out.println(student);

		
		Map<String, String> student2 = new TreeMap<>();
		student2.put("02", "鐘明");
		student2.put("03", "亣明");
		student2.put("01", "曉明");
		System.out.println(student2);

		
	}
	

}
