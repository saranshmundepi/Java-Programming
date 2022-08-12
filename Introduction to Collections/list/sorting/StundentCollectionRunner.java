package com.saransh.collections.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StundentCollectionRunner {

	
	public static void main(String[] args) {
		
		
		List<Student> students=List.of(new Student(3,"Hitesh"),new Student(1,"Aman"),
				new Student(2,"Shivam"));
		List<Student> studentsAl=new ArrayList<>(students);
		
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		
		System.out.println("Desc by Id: "+studentsAl);
		
		Collections.sort(studentsAl,new AscStudentIdComparator());
		
		System.out.println("Asc by Id: "+studentsAl);
		
		Collections.sort(studentsAl,new DescStudentNameComparator());
		
		System.out.println("Desc by Name: "+studentsAl);
		
		Collections.sort(studentsAl,new AscStudentNameComparator());
		
		System.out.println("Asc by Name: "+studentsAl);
		
		
	}

}
