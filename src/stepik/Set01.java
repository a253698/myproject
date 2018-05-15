package stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set01 {

	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>(Arrays.asList("Alpha", "Gamma", "Omega"));
		List<String> list = new ArrayList<String>(set);

		for (int n = 0; n <= list.size(); n++) {
			System.out.println(list.get(n));
		}
	}
}