package com.saransh.abstraction;
//This class just tells about the basic structure of any recipe
public abstract class AbstractRecipe {
	
	//execute method is a non abstract method which is defined within the abstract class
	public void execute() {
		
		getReady();
		doTheDish();
		cleanup();
		
	}
	/*abstract methods are only declared in abstract class,
	 *  they will be defined in the child subclasses.
	 */
	protected abstract void getReady();

	protected abstract void doTheDish();
	
	protected abstract void cleanup();
	

}