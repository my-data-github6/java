package com.sunbeam;

import java.util.Iterator;
import java.util.TreeSet;
/*
 * In above assignment use TreeSet instead of LinkedHashSet. 
 * Use natural ordering for the Book. If any book with duplicate 
 * isbn is added, what will happen?
 * Books are stored in which order?
 */

public class TesterTreeSet {
	public static void main(String[] args) {
		TreeSet<Book> treeset = new TreeSet<>();
		
		Book b;
		b = new Book("var2",599.00,"Abhi",2);
		treeset.add(b);
		b = new Book("var4",299.00,"Krisha",3);
		treeset.add(b);
		b= new Book("var1",799.00,"Varad",1);
		treeset.add(b);
		b = new Book("var4",799.00,"Rutvik",7);
		treeset.add(b);
		b = new Book("var1",899.00,"Mor",2);
		treeset.add(b);
		b = new Book("var5",499.00,"Rohit",4);
		treeset.add(b);
		b = new Book("var3",699.00,"jags",3);
		treeset.add(b);
		
		Iterator<Book> itr = treeset.iterator();
		while (itr.hasNext()) {
			Book bx = itr.next();
			System.out.println(bx);
		}	
	}
}

/*
 * 1. Duplicates are suppressed.
 * 2. using Comparable we achieve natural ordering.
*/
