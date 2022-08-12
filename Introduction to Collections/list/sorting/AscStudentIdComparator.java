package com.saransh.collections.list.sorting;

import java.util.Comparator;

public class AscStudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {		
		return Integer.compare(student1.getId(), student2.getId());
	}

}
