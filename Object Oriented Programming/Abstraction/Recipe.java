package com.saransh.abstraction;

public class Recipe extends AbstractRecipe{

	//Abstract methods inherited from parent abstract class AbstractRecipe are defined here
	@Override
	protected void getReady() {
		System.out.println("get raw materials");
		System.out.println("get utensils");
	}
	
	@Override
	protected void doTheDish() {
		System.out.println("Do the Dish");		
	}
	
	@Override
	protected void cleanup() {
		System.out.println("Cleanup the Utensils");
	}
}