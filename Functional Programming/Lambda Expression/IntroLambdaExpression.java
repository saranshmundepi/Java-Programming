package com.saransh.functionalprogramming.lambda_expression;

import java.util.List;

public class IntroLambdaExpression {
	
	public static void main(String args[])
	{
		List<String> list=List.of("Apple","Banana","Cat","Dog");
		printWithFP(list);
		
	}
	private static void printWithFP(List<String> list) {
			list.stream().forEach(
					element->System.out.println("element: "+element) //Lambda Expression
					);
		}
}