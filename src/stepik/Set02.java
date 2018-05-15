package stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Set02 {

	 public static void main(String[] args) {
		    //put your code here
		 TreeSet<String> set = new TreeSet<>(Arrays.asList("6", "postgres", "sqlite","oracle","mongodb","postgres", "mssql"));
		 List<String> list = new ArrayList<String>(set);
		 
		 list.remove("6");
		 
		 for(int n=0;n<=list.size();n++){
			 System.out.println(list.get(n));
		 }
		  }
}
