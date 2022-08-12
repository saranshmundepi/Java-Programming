package com.saransh.generics.wildcardsbounding;

import java.util.ArrayList;

public class UpperBoundWildCrd {

	public static void main(String[] args) {
		
		
		ArrayList<? extends Student> al1=new ArrayList<>();
		//Only Student class and its sub classes can be assigned to this ArrayList
		
		ArrayList<EngineeringStudent> al2=new ArrayList<>();
		EngineeringStudent e=new EngineeringStudent("Aman","Rawat","0123456789","GEIT","99985");
		EngineeringStudent f=new EngineeringStudent("Shivam","Rana","9876543210","DIT","30285");
		al2.add(e);
		al2.add(f);
		
		System.out.println(al1.toString());

	}

}
