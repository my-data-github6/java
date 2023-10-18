package question_3;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
		Student[] arr = new Student[6];
		arr[0] = new Student(80086,"Varad","Nanded",84);
		arr[1] = new Student(80094,"Abhijeet","Nanded",94);
		arr[2] = new Student(80099,"Jagdish","Pune",98);
		arr[3] = new Student(80104,"RUtvik","Amravati",97);
		arr[4] = new Student(80110,"Patrakar","Akola",92);
		arr[5] = new Student(80001,"Mayuri","beed",98);
	
		System.out.println("Before Sort: ");
		for(Student st:arr ) 
			System.out.println(st);
	
		Arrays.sort(arr);
		
		//local class 1st level City
		class StuCityComparator implements Comparator<Student>{
			@Override
			public int compare(Student arg0, Student arg1) {
				int diff = - arg0.getCity().compareTo(arg1.getCity());
				if(diff == 0)
					diff = - Double.compare(arg0.getMarks(), arg1.getMarks());
					if(diff == 0)
						diff = arg0.getName().compareTo(arg1.getName());
				return diff;
			}
		}
		
		StuCityComparator sc = new StuCityComparator();
		Arrays.sort(arr,sc);
		System.out.println("After Sort by City: ");
		for (Student student : arr) {
			System.out.println(student);
		}
		
		
		//local class 2nd level by marks 
//		class StuMarksComparator implements Comparator<Student>{
//			@Override
//			public int compare(Student M1, Student M2) {
//				int diff = Double.compare(M1.getMarks(), M2.getMarks());
//				return diff;
//			}
//		}
//		
//		StuMarksComparator sm = new StuMarksComparator();
//		Arrays.sort(arr,sm);
//		System.out.println("After Sort by Marks: ");
//		for (Student student : arr) {
//			System.out.println("sc");
//		}
//		//local class 3rd level by name
//		class StuNameComparator implements Comparator<Student>{
//
//			@Override
//			public int compare(Student S1, Student S2) {
//				int diff = S1.getName().compareTo(S2.getName());
//				return diff;
//			}
//		}
//		
//		StuNameComparator sn = new StuNameComparator();
//		Arrays.sort(arr,sn);
//		System.out.println("After Sort by Name: ");
//		for (Student student : arr) {
//			System.out.println("sn");
//		}
		
		
		

	}

}
