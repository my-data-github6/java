package question2;

import java.util.*;

public class StringLength {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Varad Somawar");
		list.add("Rutvik");
		list.add("Abhijit");
		list.add("Jagdish");
		list.add("Ashish");
		list.add("Rohit");
		list.add("Mor");
		list.add("Krisha");
		list.add("Zarad");

		//local class
		class Max implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			return s1.length()-s2.length();
		}
		}
		Max m1 = new Max(); 
		System.out.println("high string :"+ Collections.max(list,m1));
//		System.out.println("high string :"+ Collections.max(list));
	}
}
