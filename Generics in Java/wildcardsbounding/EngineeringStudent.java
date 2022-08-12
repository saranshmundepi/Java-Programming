package com.saransh.generics.wildcardsbounding;

public class EngineeringStudent extends Student{
	private String college;
	private String rollNo;
	
	
	public EngineeringStudent(String firstName, String lastName, String mobNumber, String college, String rollNo) {
		super(firstName, lastName, mobNumber);
		this.college = college;
		this.rollNo = rollNo;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getRollNo() {
		return rollNo;
	}


	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	

}
