package com.saransh.functionalprogramming.streams;

import java.util.List;
import java.util.stream.IntStream;

public class IntStreamMap {

	public static void main(String[] args) {
		
		//Printing squares of first 10 numbers
		System.out.print("Squares of first 10 natural numbers: [ ");
		IntStream.range(1, 11).map(e->e*e).forEach(e->System.out.print(e + " "));
		System.out.println("]\n");
		
		//Printing elements of list in lower case
		List<String> list=List.of("Apple","Ant","Bat");
		System.out.println("given list: " + list);
		System.out.print("given list's elements in lower case: [ ");
		list.stream().map(s->s.toLowerCase()).forEach(e->System.out.print(e + " "));
		System.out.println("]\n");
		
		//Printing length of element of given stream
		System.out.println("given list: " + list);
		System.out.print("length of each element of the given list: [ ");
		list.stream().map(s->s.length()).forEach(e->System.out.print(e + " "));
		System.out.println("]");
	}

}
