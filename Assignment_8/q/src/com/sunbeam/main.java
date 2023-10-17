package com.sunbeam;
import java.util.*;

class Box<T>
{
	private T obj;
	public void set(T val) {this.obj =val;}
	public T get() {return this.obj;}

}
public class main 
{
     public static void printDisplayableBox(Box<? extends Displayable> b)
     {
    	 b.get().display();
     }
     public static void printBox(Box<?> b)
     {
    	 System.out.println(b.get().toString());
     }
     
     public static void main(String[] args) {
    	 Box<Person> b1 = new Box<>();
    	 b1.set(new Person("name", 20));
    	 printDisplayableBox(b1);
    	 
    	 Box<Date> b2 = new Box<>();
    	 b2.set(new Date(1,1,2000));
    	 //printDisplayableBox(b2);
    	 
    	 Box<String> b3 = new Box<>();
    	 b3.set("Hello");
    	 //printDisplayableBox(b3);
    	 
    	 printBox(b3);
    	 printBox(b2);
    	 printBox(b1);
    	 
    	 
    	 
    	// Box<>
    	 
    	 
    	 
     }
     
}
