package com.app.tester;

import java.util.Scanner;

import com.app.geometery.Point2D;

class Menu{
	 public  int menu1()
	 {
		 Scanner scanner=new Scanner(System.in);
		 int choice;
		 System.out.println("**************************");
		 System.out.println("For Exit press 0");
		 System.out.println("1 Add x, y Axis ");
		 System.out.println("2 Display detail of specific position");
		 System.out.println("3 Diaply detail for all x-y point");
		 System.out.println("4 Display distance between specified points");
		 System.out.println("******************************");
		 
		 choice=scanner.nextInt();
		 return choice;
	 }
	 
}

public class TestPointingArray {
	
		public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int arraySize;
		System.out.print("Enter the size of Array = ");
		arraySize=sc.nextInt();
		int index=0;
		
		Point2D []point2D=new Point2D[arraySize];
		Menu menu =new Menu();
		
		int choice;
		while((choice=menu.menu1())!=0)
		{
			switch (choice) {

			case 1:
				if(index<arraySize)
				{
					point2D[index]=new Point2D();
					point2D[index].accept();
					index++;
					
				}
				else
				{
					System.out.println("Array is full");
				}
				break;
				
			case 2:
				System.out.println("Enter the index for which you want to check");
				int check=sc.nextInt();
				
				if(point2D[check]==null)
				{
					System.out.println("Invalid index , pls retry!!!!");
				}
				else
				{
					point2D[check].display();
				}
				break;
				
			case 3:
				if (index > 0) {
                    for (int i = 0; i < index; i++) {
                    	point2D[i].display();
                    }
                }
				
				break;
				
			case 4:
				int x,y;
				System.out.print("Enter The Two Index To Find The Distance ");
				x=sc.nextInt();
				y=sc.nextInt();
				if(x<index && y<index)
				{
					  if(point2D[x].isEqual(point2D[y]))
					  {
						  System.out.println("Point are equal");
					  }
					  else
					  {
					double result;
					result=point2D[x].calculateDistance(point2D[y]);
					
					System.out.println("Distance is "+result);
				}
					
				}
			      break;	

			default:
				System.out.println("Please Enter The Valid Choice ....):");
				break;
			}
			
		}
		
		
//		
//		point2D[0]=new  Point2d();
//		point2D[0].accept();
//		point2D[0].display();
		sc.close();
	}
		

}
