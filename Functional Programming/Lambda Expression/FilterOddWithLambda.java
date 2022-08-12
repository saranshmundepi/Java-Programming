package com.saransh.functionalprogramming.lambda_expression;

import java.util.List;

public class FilterOddWithLambda {

	public static void main(String[] args) {

		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		printOdd(list);
		printEven(list);
	}
	private static void printOdd(List<Integer> list) {
		
		list.stream().filter(element->(element%2==1)).forEach(element->System.out.println("Odd elemt: "+element));
		
	}
	private static void printEven(List<Integer> list) {
		
		list.stream().filter(element->(element%2==0)).forEach(element->System.out.println("Even elemt: "+element));
		
	}
}
