package question_4;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		n= sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for (int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

