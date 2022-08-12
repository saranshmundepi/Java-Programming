package com.saransh.collections.list.array_list;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String firstName;
	private String lastName;
	
	//Declaring an ArrayList marks
	private ArrayList<Integer> marks=new ArrayList<Integer>();
	
	Student(String firstName,String lastName,int... marks)	//using variable argument
	{
		setFirstName(firstName);
		setLastName(lastName);
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	public ArrayList<Integer> getMarks() {
		return marks;
	}
 
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	public int getNumberOfSubjects() {
		
		
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		
		int sum=0;
		//using enhanced for loop to traverse ArrayList and find sum of marks
		
		for(int x:this.marks)
			sum=sum+x;
		return sum;
	}

	public int getMinimumMarks() {
		
		return Collections.min(this.marks);
	}

	public int getMaximumMarks() {
		return Collections.min(this.marks);
	}

	public BigDecimal getAverageMarks() {
		
		if(this.marks.size()>0) {
			int sum=getTotalSumOfMarks();
			BigDecimal avg= new BigDecimal(sum).divide(new BigDecimal(this.marks.size()),3,RoundingMode.UP );
			return avg;
		}
		return new BigDecimal(0);
	}
	
	public void addNewMark(int mark) {
		this.marks.add(mark);			//Adding an element to ArrayList
		
	}
	
	public void removeMarkAtIndex(int index) {
		this.marks.remove(index);		//Removing an element from ArrayList
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

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks + "]";
	}
	

}