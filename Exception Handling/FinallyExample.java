package com.saransh.exception_handling;

import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		
		Scanner scanner=null;
		try {
		scanner=new Scanner(System.in);
		int[] numbers= {1,2,3,4,5};
		int number=numbers[6];
		
		System.out.println(number);
		/*Before Scanner closes if the exception occurs
		 *  then we will have scanner object open, 
		 *  which may cause resource leakage
		 */
		System.out.println("Before Scanner Close");
		//scanner.close(); // releasing the resources in finally block instead.
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		/*Even if an exception occurs, we can execute
		 * code to release resources which were instantiated
		 * in the block or method in which exception occurs using
		 * the finally block.
		 */
		finally {
			scanner.close();
			System.out.println("scanner closed");
		}
		
		System.out.println("Just before closing of main");

	}

}
