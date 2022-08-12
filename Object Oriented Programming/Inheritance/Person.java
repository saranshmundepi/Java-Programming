package com.saransh.inheritance;

public class Person {
	protected String name;
	protected String email;
	protected String phoneNumber;
	
	
	
	public Person(String name, String email, String phoneNumber) {
		
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override				/*overriding the toString() method of Object class, 
							*which is by default extended the every class.
							*Object class is the root of the class hierarchy.*/
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
