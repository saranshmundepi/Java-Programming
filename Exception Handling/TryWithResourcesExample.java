package com.saransh.exception_handling;

import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		
		//Multiple resource could be separated by inserting ; between them
		
		//catch and finally block are optional with "try with resources"
		try(Scanner scanner=new Scanner(System.in)){ // added in java 7
			int numberArr[]= {1,2,3,4,5};
			int number= numberArr[5];//throws exception
			
			System.out.println(number);
		}
		
		//Handling multiple Exceptions in single block
		catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			e.printStackTrace();	
		}
		
		System.out.println("Just before closing of main");

	}

}
