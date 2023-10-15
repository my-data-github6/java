package question_4;

import java.util.*;

public class Star1 {

	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		n= sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
