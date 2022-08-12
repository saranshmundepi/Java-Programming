package com.saransh.exception_handling.custom_exceptions.unchecked_exceptions;

public class CustomCheckedExceptionExample {	//There is no need to throw a Runtime exception

	public static void main(String[] args) {

		Amount amount1=new Amount("USD",10);
		Amount amount2=new Amount("EUR",20);
		
		amount1.add(amount2);
		/*Typically in large application we log 
		 * the exception, but here we are throwing it
		 */
		
		System.out.println(amount1);

	}

}
