package com.saransh.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> chars= List.of('A','Z','A','B','Z','F','X','C','X');
		
		/*Does not guarantee order,
		 * but the most efficient(implemented using a hash table)
		 */
		Set<Character> uniqueChars= new HashSet<>(chars);
		
		
		/*Stores elements in sorted order
		 * (Implemented using Red Black tree)
		 */
		Set<Character> uniqueCharsInSortedOrder= new TreeSet<>(chars);
		Set<Character> uniqueCharsInDescOrder= ((TreeSet<Character>) uniqueCharsInSortedOrder).descendingSet() ;
		
		/*Stores elements in order of insertion
		 * (Implemented using HashSet and LinkedList to maintain order)
		 */
		Set<Character> uniqueCharsInInsertionOrder= new LinkedHashSet<>(chars);
		
		System.out.println("Unique characters: "+ uniqueChars);
		System.out.println("Unique characters in sorted order: "+ uniqueCharsInSortedOrder);
		System.out.println("Unique characters in descending order: "+ uniqueCharsInDescOrder);
		System.out.println("Unique characters in order of insertion: "+ uniqueCharsInInsertionOrder);
		
		
		System.out.println();
		System.out.println("********************************************************");
		
		System.out.println("Can a duplicate element be added to HashSet: "+uniqueChars.add('A'));
		System.out.println("Can a duplicate element be added to TreeSet: "+uniqueCharsInSortedOrder.add('A'));
		System.out.println("Can a duplicate element be added to LinkedHashSet: "+uniqueCharsInInsertionOrder.add('A'));
	}

}
