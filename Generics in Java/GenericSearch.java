package com.saransh.generics;

public class GenericSearch {
	
	/*genSearch function can be used to search
	 *an object in array of objects of any type
	 */
	
	/*the generic are to be mentioned even before
	 *  the return type of the function, as 
	 *  the return type can also be of the same type.
	 */
	public static <T> boolean genSearch(T arr[],T x)
	{
		for(T a:arr) {
			if(a==x)
				return true;
		}
		return false;
	}

}
