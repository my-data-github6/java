package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		this.name=sc.next();
		System.out.println("Enter age :");
		this.age=sc.nextInt();
	}
	public void display() {
		System.out.println("Name:"+this.name);
		System.out.println("Age :"+this.age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
