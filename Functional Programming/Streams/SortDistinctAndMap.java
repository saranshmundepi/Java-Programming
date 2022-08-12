package com.saransh.functionalprogramming.streams;

import java.util.List;

public class SortDistinctAndMap {

	public static void main(String[] args) {

		//Sorting a  list
		List<Integer> numbers1=List.of(3,5,8,213,45,4,7);
		System.out.println("Given list: " + numbers1);
		System.out.print("Sorted list: [ ");
		numbers1.stream().sorted().forEach(e->System.out.print(e + " "));
		System.out.println("]\n");
		
		//Finding distinct elements
		List<Integer> numbers2=List.of(3,5,3,213,45,4,7,213);
		System.out.println("Given list: " + numbers2);
		System.out.print("List with distinct elements: [ ");
		numbers2.stream().distinct().forEach(e->System.out.print(e + " "));
		System.out.println("]\n");
		
		//Finding distinct elements and sorting them
		List<Integer> numbers3=List.of(3,5,3,213,45,4,7,213);
		System.out.println("Given list: " + numbers3);
		System.out.print("List with distinct and Sorted elements: [ ");
		numbers3.stream().distinct().sorted().forEach(e->System.out.print(e + " "));
		System.out.println("]\n");
		
		//Finding squares of distinct elements
		List<Integer> numbers4=List.of(3,5,3,213,45,4,7,213);
		System.out.println("Given list: " + numbers4);
		System.out.print("List with squares of distinct elements: [ ");		
		numbers4.stream().distinct().map(e->e*e).forEach(e->System.out.print(e + " "));
		System.out.println("]");
	}

}
