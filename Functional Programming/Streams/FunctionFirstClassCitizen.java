package com.saransh.functionalprogramming.streams;

import java.util.List;
import java.util.function.Predicate;

public class FunctionFirstClassCitizen {

	public static void main(String[] args) {

		//1.Storing function in variables
		//2.Passing functions to methods
		//3.Returning function from methods

		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = createOddPredicate();
		
		System.out.println("List of squares of even no: ");
		List.of(1,2,3,4,5,6).stream()
		.filter(evenPredicate)
		.map(n -> n*n)
		.forEach(e -> System.out.println(e));
		
		System.out.println("List of squares of odd no: ");
		List.of(1,2,3,4,5,6).stream()
		.filter(oddPredicate)
		.map(n -> n*n)
		.forEach(e -> System.out.println(e));
		
		
	}
	
	private static Predicate<? super Integer> createOddPredicate() {
		return n->(n%2==1);
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n->(n%2==0);
	}

}
