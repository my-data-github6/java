package question_2;

import java.util.*;

public class StringLength {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Priyanka");
		list.add("Rachna");
		list.add("Abhijit");
		list.add("Amanushdada");
		list.add("Ashish");
		list.add("Rohini");
		list.add("Moru");
		list.add("Krishai");
		list.add("Zaradan");
		
		class Max implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			return s1.length()-s2.length();
		}
		}
		Max m1 = new Max(); 
		System.out.println("high string :"+ Collections.max(list,m1));
	}
}