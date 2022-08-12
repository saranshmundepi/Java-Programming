package com.saransh.generics;

public class GenSearchRunner {
	public static void main(String[] args) {
		
		Integer[] intArr= {10,20,30,40,50,60,100};
		Integer a=70;
		System.out.println(GenericSearch.genSearch(intArr,a));
		//genSearch function used to search a Integer in Integer array
		
		String[] strArr= {"ab","bc","cd","de","ef"};
		String b="ef";
		System.out.println(GenericSearch.genSearch(strArr,b));
		//same function is used to search a String in String array
	}
}
