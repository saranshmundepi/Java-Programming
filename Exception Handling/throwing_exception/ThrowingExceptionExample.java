package com.saransh.exception_handling.throwing_exception;

public class ThrowingExceptionExample {

	public static void main(String[] args) throws Exception {

		Amount amount1=new Amount("USD",10);
		Amount amount2=new Amount("Eur",20);
		
		amount1.add(amount2);
		/*Typically in large application we log 
		 * the exception, but here we are throwing it
		 */
		
		System.out.println(amount1);

	}

}
