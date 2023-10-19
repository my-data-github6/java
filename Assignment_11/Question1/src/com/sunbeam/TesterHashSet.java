/*1. Store few books (hardcoded values with the Book class in previous assignment) 
 * in a HashSet and display them using iterator.If any book with 
 * duplicate isbn is added, what will happen? 
 * Books are stored in which order? 
 * Solve duplicate ISBN problem.
*/
package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class TesterHashSet {

	public static void main(String[] args) {
		
		Set<Book> set = new HashSet<>();
		
		Book b;
		b= new Book("var1",799.00,"Varad",1);
		set.add(b);
		b = new Book("var2",599.00,"Abhi",2);
		set.add(b);
		b = new Book("var3",699.00,"jags",3);
		set.add(b);
		b = new Book("var1",899.00,"Var",2);
		set.add(b);
				
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
			
		}
	}
}

/*
 * 1.yes on previous book class we dont ovarride the hashCode() method.
 * due to this our duplicate elements(Books) are not suppressed.because 
 * for checking duplicates hashSet uses hashCode() method + equals() method.
 * 
 * 2. Books are stored in non-ordered , it is stored in any order based
 * on hashCode.
 * 
 * 3. Overriding hashCode() and equals() method we can solve the problem of 
 * duplicate books in set
 */
