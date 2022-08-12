package com.saransh.functionalprogramming.optional_class;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {


		//Finding greatest element in the given list
		List<Integer> list =/*List.of(23,12,34,53,8);*/List.of();
		System.out.println("Given List: "+list);
		Optional<?> obj=list.stream().max((a,b)->Integer.compare(a,b));
		if(obj.isPresent())
			System.out.println("Maximum of the elements in the given list: "+obj.get());
		else
			System.out.println("No element found");
		
		//Finding smallest element in the given list 
		
		List<Integer> list2 =/*List.of(23,12,34,53,8);*/List.of();
		System.out.println("Maximum of the elements in the given list: "+list2.stream().min((a,b)->Integer.compare(a,b)).orElse(0));
		
	}

}
