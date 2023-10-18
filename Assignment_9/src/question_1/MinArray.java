package question_1;

import java.util.Iterator;

public class MinArray {

	static <T extends Number> T findMin(T[] arr) {
		T temp = arr[0];
		for (T t : arr) {
			if(t.intValue()<temp.intValue())
				temp=t;
			if(t.doubleValue()< temp.doubleValue())
				temp=t;
		}
		return temp;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println("MInimum :"+ min1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println(min2);

	}

}
