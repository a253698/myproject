package stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Set0202 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(
				Arrays.asList("6", "postgres", "sqlite", "oracle", "mongodb", "postgres", "mssql"));
		set.remove("6");
		for (String name : set) {
			System.out.println(name);
		}
	}

}
