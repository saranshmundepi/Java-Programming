package com.saransh.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	private int age;
	private String firstName;
	private String lastName;

	//setters are used to enter valid data by restricting direct access from other classes
	void setAge(int age) {
		if ((age < 18)||(age>60)) {
			System.out.print("Enter valid age");
		}
		this.age = age;
	}
	/*this is just an example to understand the use of encapsulation,
	 *  although exception must also be handled in the getters.
	 */
	void setFirstName(String firstName) {

		if (firstName == null) {
			System.out.print("Enter valid name\n");
			return;
		}
		String regex = "^[A-Za-z][a-z]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			this.firstName = firstName;
			return;
		}
		System.out.print("Enter valid name\n");
		return;
	}

	void setLastName(String lastName) {
		 setFirstName(lastName);
		
	}
	

	int getAge() {
		return age;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}
}