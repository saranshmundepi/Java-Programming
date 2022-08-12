package com.saransh.collections.queue.priority_queue;

import java.util.Comparator;

//Comparator to give priority to higher value of string
public class StringComparator implements Comparator<String>{
	
	@Override
	public int compare(String string1, String string2) {
			
		return string2.compareToIgnoreCase(string1);
	}

}
