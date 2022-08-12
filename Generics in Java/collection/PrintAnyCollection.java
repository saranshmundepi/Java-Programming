package com.saransh.generics.collection;

import java.util.Collection;

public class PrintAnyCollection {
	//Any type of Collection object can be passed to the function
	public static void printCollection(Collection<?> c)
	{
		for(Object e:c)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
