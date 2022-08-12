package com.saransh.enumeration;

/*An enum type is a special data type that enables
 *for a variable to be a set of predefined constants.
*/
enum Season{
	WINTER(4),SPRING(1),SUMMER(2),FALL(3); //enum constants are public static and final
	
	/* Ordinals are the values defined by the order of variables in enum.
	 * We should not use ordinal to store values in the database.
	 * Instead we should assign and use value to the constants.
	*/
	
	private int value;
	
	private Season(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}

public class EnumRunner {
	
	
	public static void main(String[] args) {
		Season season1=Season.WINTER;
		Season season2=Season.valueOf("SPRING");
		
		System.out.println("season1 name: "+season1.name()+" season1 ordinal: "+season1.ordinal()+" season1 value: "+season1.getValue());
		System.out.println("season2 name: "+season2.name()+" season2 ordinal: "+season2.ordinal()+" season2 value: "+season2.getValue());
		
	}

}
