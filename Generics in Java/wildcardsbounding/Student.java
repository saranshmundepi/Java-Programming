package com.saransh.generics.wildcardsbounding;

public class Student {
	protected String firstName;
	protected String lastName;
	protected String mobNumber;
	public Student(String firstName, String lastName, String mobNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNumber = mobNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", mobNumber=" + mobNumber + "]";
	}
	
	
}
