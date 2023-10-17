package com.sunbeam;

import java.util.*;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day=");
		this.day = sc.nextInt();
		System.out.println("enter the month");
		this.month =sc.nextInt();
		System.out.println("enter the year");
		this.year = sc.nextInt();
	}
	public void display()
	{
		System.out.println("day="+day);
		System.out.println("month ="+month);
		System.out.println("year"+year);
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	

}
