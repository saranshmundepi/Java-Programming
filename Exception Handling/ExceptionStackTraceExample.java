package com.saransh.exception_handling;

public class ExceptionStackTraceExample {
/*Exceptions goes up the call chain, and if the 
 * exception is not handled in the function or 
 * the caller function then the caller function 
 * will also not execute
 */
	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");
		
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	
	private static void method2() {
		String str=null;
		str.length();
		System.out.println("Method2 Ended");
	}

}
