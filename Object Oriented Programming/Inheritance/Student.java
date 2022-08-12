package com.saransh.inheritance;


//Since class student have a IS A relationship with Person it extends the class Person
public class Student extends Person{
	
	private String collegeName;
	private int year;
	
	//All the methods with access are accessible to child class
	
	public Student(String name, String email, String phoneNumber, String collegeName, int year) {
		super(name, email, phoneNumber);           //super() calls the constructor of parent class
		this.collegeName = collegeName;
		this.year = year;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override									//Overriding the to string method of parent class
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", collegeName="+collegeName+", year="+year+"]";
	}
				//We may observe that fields of the parent class are visible in the child class(since they are protected)
	
	
	
}
