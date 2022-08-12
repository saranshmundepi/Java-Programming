package com.saransh.collections.list.linked_list;
/* Since Collection Framework's List interface 
 * provide same interface to all the sub interfaces and classes
 * there is less effort to modify the according to the change in requirement.
 * 
 */
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
				
		//Any number of marks can be passed to a variable argument
		List <Student> studentList=new LinkedList<>();
		Student student1 = new Student("Aman","Pokhriyal",95,98,99);
		Student student2 = new Student("shivam","Rana",99,98,99);
		Student student3 = new Student("Hitesh","Kathait",94,98,96,84);
		Student student4 = new Student("Nitin","Uniyal",55,68,86);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		for(Student x:studentList) {
		System.out.println();
		System.out.println("************************************************");	
		System.out.println();
		int number=x.getNumberOfSubjects();
		System.out.println(x.getFirstName()+" "+x.getLastName()+" have "+"number of Subjects: "+number);
		
		int sum=x.getTotalSumOfMarks();
		System.out.println(x.getFirstName()+" "+x.getLastName()+" have "+"total sum of marks: "+sum);
		
		int maximumMarks=x.getMinimumMarks();
		System.out.println(x.getFirstName()+" "+x.getLastName()+" have "+"minimum marks: "+maximumMarks);
		
		int minimumMarks=x.getMaximumMarks();
		System.out.println(x.getFirstName()+" "+x.getLastName()+" have "+"maximum marks: "+minimumMarks);
		
		BigDecimal average=x.getAverageMarks();
		System.out.println(x.getFirstName()+" "+x.getLastName()+" have "+"average marks: "+average);
		}
		
		System.out.println();
		System.out.println("************************************************");	
		
		studentList.get(0).addNewMark(97);
		
		System.out.println(studentList.get(0).toString()); 
		
		studentList.get(0).removeMarkAtIndex(0);
		
		System.out.println(studentList.get(0).toString()); 
		
		System.out.println();
		System.out.println("************************************************");	
		System.out.println("Removed Students with first name Nitin");
		
		//Using iterator to remove elements matching a string, since loops may cause unwanted results
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getFirstName().contentEquals("Nitin")){		
				iterator.remove();
			}
		}
		
		//Using for loop to print contents of LinkedList
		for(Student x:studentList) {
			System.out.println(x.toString());
		}
	}

}
