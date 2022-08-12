/*This example demonstrates the use of Encapsulation*/
package com.saransh.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {

		Employee a = new Employee();
		a.setAge(20);
		a.setFirstName("Saransh");
		a.setLastName("Mundepi");

		System.out.printf("%s %s is %d years old", a.getFirstName(), a.getLastName(), a.getAge());
	}

}