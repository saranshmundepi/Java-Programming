package com.saransh.string;

public class stringRunner {

	public static void main(String[] args) {
		
		/*Unlike C,C++ String in java is not an array of characters 
		 * ending witch 'NULL'. It is a class whose objects can be instantiated.
		 */
		
		String firstName="Ankush"; 
		/*this string object get memory allocated in the
		 String Constant pool part of heap
		 */
		
		String lastName=new String("Uniyal");
		/*this object gets memory in Heap*/
		
		firstName.toUpperCase();
		System.out.println(firstName);
		/*Strings are immutable in Java,
		 * therefore we need to pass reference of the new string object
		 */
		
		String firstNameUpper=firstName.toUpperCase();
		lastName=lastName.toLowerCase();
		System.out.println("First name in Upper Case: "+firstNameUpper+"\nLast name in lower case: "+lastName);
		
		System.out.println("First name concatenated with last name: "+firstName.concat(lastName)); 
		
		String str1="Ankush";
		//Reference to the object already created in String Constant pool is passed
		
		System.out.println("Comparing ANKUSH to Ankush using equals: "+firstNameUpper.equals(str1));
		
		System.out.println("Comparing ANKUSH to Ankush using equalsIgnoreCase: "+firstNameUpper.equalsIgnoreCase(str1));
		
		System.out.println("Replacing H in ANKUSH with S: "+firstNameUpper.replace('H', 'S'));
		
		String str2="  trailing and heading whitespaces  ";
		
		System.out.println(str2.trim()+" gone");
		
		//Accessing string elements using charAt
		for(int i=0;i<firstName.length();i++)
		{
			System.out.println(firstName.charAt(i));
		}
		
		
		//Converting String to character array
		char[] charArr=lastName.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			System.out.println(charArr[i]);
		}
		
		
	}

}
