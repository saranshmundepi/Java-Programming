package com.saransh.abstraction;

public class RecipeWithMicrowave extends AbstractRecipe{
	
	/*Abstract methods inherited from parent abstract class 
	 * AbstractRecipe are defined here, having a different 
	 * implementation from the other child class
	 */
	
	@Override
	protected void getReady() {
		System.out.println("get raw materials");
		System.out.println("get utensils");
		System.out.println("Switch on the Microwave");
	}
	
	@Override
	protected void doTheDish() {
		System.out.println("Get the stuff ready");
		System.out.println("Do the Dish");		
	}
	
	@Override
	protected void cleanup() {
		System.out.println("Cleanup the Utensils");
		System.out.println("Switch off the Microwave");
	}

}
