package com.saransh.anonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *there is no need to maintain a separate class if it is not reused
class LengthComparator implements Comparator<String>{
	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());
	}
	
}
*/

public class AnonymusClassExample {

	public static void main(String[] args) {

		List<String> animals=new ArrayList<String>(
				List.of("Ant","Cat","Ball","Elephant"));
		
		/*There is no name of the class passed as second argument
		 * therefore it is called anonymous class. Anonymous class
		 * are useful if we require some piece of code which is not 
		 * much reused.
		 */
		Collections.sort(animals,new Comparator<String>() {
					@Override
					public int compare(String str1, String str2) {
					return Integer.compare(str1.length(), str2.length());
			}});
		System.out.println(animals);
	}

}
