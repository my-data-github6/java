package com.app.geometry;

import java.util.Objects;


public class Point2D {

	private int x;
	private int y;
	
	
	
	public Point2D(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails() {
		String msg="this is point (x,y) is ("+x+","+y+").";
		return msg;
	}
	
//	public boolean isEqual(Point2D p1,Point2D p2) {
//		if(p1.x==p2.x)
//			if(p1.y==p2.y)
//				return true;
//		
//		return false;
//	}
//	

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
	
	public double calculateDistance(Point2D p1,Point2D p2) {
//		System.out.println("in distance method");
		double dis = Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.x),2));
		return dis;	
	}
	
	

}
