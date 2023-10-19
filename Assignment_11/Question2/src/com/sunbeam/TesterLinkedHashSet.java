package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*2. In above assignment use LinkedHashSet instead of HashSet. 
 * If any book with duplicate isbn is added, what will happen? 
 * Books are stored in which order?
 */
public class TesterLinkedHashSet {
	
	public static void main(String[] args) {
		LinkedHashSet<Book> lHset = new LinkedHashSet<>();

		Book b;
		
		b = new Book("var2",599.00,"Abhi",2);
		lHset.add(b);
		b = new Book("var4",299.00,"Krisha",3);
		lHset.add(b);
		b= new Book("var1",799.00,"Varad",1);
		lHset.add(b);
		b = new Book("var4",799.00,"Rutvik",7);
		lHset.add(b);
		b = new Book("var1",899.00,"Mor",2);
		lHset.add(b);
		b = new Book("var5",499.00,"Rohit",4);
		lHset.add(b);
		b = new Book("var3",699.00,"jags",3);
		lHset.add(b);
		
		Iterator<Book> itr = lHset.iterator();
		while (itr.hasNext()) {
			Book book = (Book) itr.next();
			System.out.println(book);
		}
	}
}

/*
 * 1. duplicate books are suppressed in linkedHashSet on the basis of 
 * isbn.
 * 2. Books are ordered in order of insertion.
 */
