package com.saransh.collections.map;

import java.util.HashMap;
import java.util.Map;

/* program to count occurrences of character in a string*/

public class CharOccuranceCounter {

	public static void main(String[] args) {
		
		String str="quick brown fox jumps over the lazy dog";
		str=str.replace(" ","");
		Map<Character,Integer> occurances =new HashMap<>();
		
		char[] chars= str.toCharArray();
		
		for(char c:chars) {
			Integer integer = occurances.get(c);
			if(integer==null) {
				occurances.put(c, 1);
			}
			else {
				occurances.put(c,integer+1);
			}
		}
		System.out.println(occurances);
	}

}
