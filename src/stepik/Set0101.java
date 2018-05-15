package stepik;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set0101 {


	  public static void main(String[] args) {


	    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

	    //write your code here

		for (String name : nameSet) {
				System.out.println(name);


	  }
	}}
