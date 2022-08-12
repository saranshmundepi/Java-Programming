package com.saransh.collections.list.sorting;

import java.util.Comparator;

public class DescStudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student Student1, Student Student2) {
		
		return Student2.getName().compareToIgnoreCase(Student1.getName());
	}

}
