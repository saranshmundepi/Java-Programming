package com.saransh.exception_handling;

public class BasicExceptionHandlingExample {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");
		
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	/*Since method2 handled the exception
	 * method1 and main will not come to know about 
	 * the exception, and they will execute their next line 
	 * of code
	 */
	private static void method2() {
		try {
			//String str=null;
			//int num=str.length();
			int[] i= {1,2};
			int num=i[3];
			System.out.println(num);
			System.out.println("Method2 Ended");
		}
		/*catch block with the most specific exception
		 * will be executed.
		 */
		catch(NullPointerException ex) {
			System.out.println("Matched NullPointerException:");
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException:");
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}
}
