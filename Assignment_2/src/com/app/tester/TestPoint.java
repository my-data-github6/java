package com.app.tester;
import com.app.geometry.*;
public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(5,5);
		System.out.println("Point 1 :"+p1.getDetails());
		Point2D p2 = new Point2D(10,10);
		System.out.println("Point 2 :"+p2.getDetails());
		p1.equals(p2);
		
		System.out.println("Distance : "+p1.calculateDistance(p1,p2));
		

	}

}
