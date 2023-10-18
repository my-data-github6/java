package question_2;

import java.util.Comparator;

public class Sort {

			static <T> void selectionSort(T[] arr, Comparator<T> c) {
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (c.compare(arr[i], arr[j]) > 0) {
							T temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
			public static void main(String[] args) {
				//local class
				class SortArray implements Comparator<Double>{
					@Override
					public int compare(Double arg0, Double arg1) {
						if(arg0.doubleValue()>arg1.doubleValue())
							return 1;
						return 0;
					}
				}
					SortArray s = new SortArray();
					Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
					for (Double double1 : arr2) {
						System.out.println("before sort : "+double1);
					}
					selectionSort(arr2,s);
					for (Double double1 : arr2) {
						System.out.println("After sort : "+double1);
					}				
				}			
		}