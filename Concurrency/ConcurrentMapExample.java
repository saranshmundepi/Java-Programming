package com.saransh.concurrency;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapExample {
	
	public static void main(String[] args) {
		
		// concurrentMap uses different locks for different regions
		
		ConcurrentMap<Character,LongAdder> occurances=new ConcurrentHashMap<>();
		
		String str="ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			occurances.computeIfAbsent(character, ch->new LongAdder()).increment();//atomic operations 
		}
		
		System.out.println(occurances);
		
	}
}
