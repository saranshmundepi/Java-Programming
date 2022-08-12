package com.saransh.functionalprogramming.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalFuncs {

	public static void main(String[] args) {

	//using reduce method to find sum of numbers
	System.out.println("Sum of first 10 Natural numbers:"+IntStream.range(1,11).reduce(0,(n1,n2)->n1+n2));
	
	//Finding greatest element in the given list
	List<Integer> list =List.of(23,12,34,53,8);
	System.out.println("\nGiven List: "+list);
	System.out.println("Maximum of the elements in the given list: "+list.stream().max((a,b)->Integer.compare(a,b)).get());
	
	//Finding smallest element in the given list
	System.out.println("Maximum of the elements in the given list: "+list.stream().min((a,b)->Integer.compare(a,b)).get());
	
	//Making separate lists of odd and even numbers from the given list
	System.out.println("\nGiven List: "+List.of(23,12,34,53,5,7));
	List<?> newlist1=List.of(23,12,34,53,5,7).stream( ).filter(e -> e%2 == 1 ).collect(Collectors.toList());
	List<?> newlist2=List.of(23,12,34,53,5,7).stream( ).filter(e -> e%2 == 0 ).collect(Collectors.toList());
	System.out.println("List of odd elements: "+ newlist1);
	System.out.println("List of even elements: "+ newlist2);
	
	
	}

}
