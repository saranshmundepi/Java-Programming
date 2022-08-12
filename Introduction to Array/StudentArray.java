package com.saransh.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentArray {
	String name;
	int[] marks;   //Declaring an Array marks
	
	StudentArray(String name,int[] marks) //passing array marks as an argument
	{
		this.name=name;
		this.marks=marks;
	}

	public int getNumberOfSubjects() {
		
		
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		
		int sum=0;
		
		//using enhanced for loop to traverse array and find sum of marks
		for(int x:this.marks)
			sum=sum+x;
		return sum;
	}

	public int getMinimumMarks() {
		
		if(this.marks.length>0)
		{
			int min=this.marks[0];
			
		//using enhanced for loop to traverse array and find minimum element of it
			for(int x:this.marks) { 
				if(x<min)
					min=x;
			}
			return min;
		}
		
		return 0;
	}

	public int getMaximumMarks() {
		
		if(this.marks.length>0)
		{
			int max=this.marks[0];
			
			//using enhanced for loop to traverse array and find maximum element of it
			for(int x:this.marks) {
				if(x>max)
					max=x;
			}
			return max;
		}
		return 0;
	}

	public BigDecimal getAverageMarks() {
		
		if(this.marks.length>0) {
			int sum=getTotalSumOfMarks();
			BigDecimal avg= new BigDecimal(sum).divide(new BigDecimal(this.marks.length),3,RoundingMode.UP );
			return avg;
		}
		return new BigDecimal(0);
	}

}
