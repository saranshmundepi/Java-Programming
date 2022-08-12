package com.saransh.collections.list.sorting;

import java.util.Comparator;

public class AscStudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student Student1, Student Student2) {
		
		return Student1.getName().compareToIgnoreCase(Student2.getName());
	}

}
