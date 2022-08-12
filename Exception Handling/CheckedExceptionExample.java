package com.saransh.exception_handling;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		try {
		method1();
		Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/*compiler throws an error is any
	 *  non Runtime exception is not handled.
	 *  try to remove throws InterruptedException from method1
	 *  and run the program.
	 */
	private static void method1() throws InterruptedException {
		Thread.sleep(2000);
	}

}
