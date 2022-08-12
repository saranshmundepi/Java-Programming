package com.saransh.functionalprogramming.lambda_expression;

import java.util.List;

public class SumOddWithLambda {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		
		int sum=list.stream().filter(element->(element%2==1)).reduce(0,(num1,num2)->num1+num2);
		
		System.out.println(sum);

	}

}
