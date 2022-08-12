package com.saransh.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hashMap=new HashMap<>();
		LinkedHashMap<Character, Integer> linkedHashMap=new LinkedHashMap<>();
		TreeMap<Character, Integer> treeMap=new TreeMap<>();
		
		for(int i=4;i>=0;i--)
			hashMap.put((char)('A'+i), 1+i);
		
		for(int i=4;i>=0;i--)
			linkedHashMap.put((char)('A'+i), 1+i);

		for(int i=4;i>=0;i--)
			treeMap.put((char)('A'+i), 1+i);
		
		//Elements may or may not get arranged in order in HashMap
		System.out.println(hashMap);
		
		//Elements will get arranged in order of insertion in LinkedHashMap
		System.out.println(linkedHashMap);
		
		//Elements will get arranged in sorted order in TreeMap
		System.out.println(treeMap);
		
	}

}
