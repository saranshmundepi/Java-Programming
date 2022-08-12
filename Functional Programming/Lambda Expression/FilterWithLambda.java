package com.saransh.functionalprogramming.lambda_expression;

import java.util.List;

public class FilterWithLambda {

	public static void main(String[] args) {

		List<String> list=List.of("Apple","Banana","Cat","Dog","Bat");
		printWithFiltering(list);

	}
	
	private static void printWithFiltering(List<String> list) {
		list.stream().filter(element->element.endsWith("at"))
					 .forEach(element->System.out.println("element: "+element));
	}
}
