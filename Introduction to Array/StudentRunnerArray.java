package com.saransh.arrays;

import java.math.BigDecimal;

public class StudentRunnerArray {

	public static void main(String[] args) {
		
		int[] marks= {98,95,100}; //storing marks as an array
		
		StudentArray student = new StudentArray("Aman",marks);
		int number=student.getNumberOfSubjects();
		System.out.println("number of Subjects: "+number);
		
		int sum=student.getTotalSumOfMarks();
		System.out.println("total sum of marks: "+sum);
		
		int maximumMarks=student.getMinimumMarks();
		System.out.println("minimum marks: "+maximumMarks);
		
		int minimumMarks=student.getMaximumMarks();
		System.out.println("maximum marks: "+minimumMarks);
		
		BigDecimal average=student.getAverageMarks();
		System.out.println("average marks: "+average);

	}

}
