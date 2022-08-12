package com.saransh.abstraction;

public class RecipeRunner {

	
	// main method to initiate the recipes' objects 
	public static void main(String[] args) {


		Recipe recipe=new Recipe();
		recipe.execute();
		
		RecipeWithMicrowave microRecipe=new RecipeWithMicrowave();
		System.out.println();
		System.out.println("Second Recipe:");
		microRecipe.execute();		
		
	}

}