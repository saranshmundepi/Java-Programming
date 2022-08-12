package com.saransh.nonAccessModifires.finalModifier;

/*Typically final is recommended on all variables and all arguments,
 * we should assign value to variables and arguments only once.
 * This is called immutable programming.Its recommended because it 
 * leads to a code which is easily readable.
 */
class Example{
	
	/* A final variable needs to be initialized
	 * when declared else compiler will throw error, unless
	 * it is not a static variable.
	 */
	//final int intA;
	static final int intB;
	static {
		intB=5;
	}
	
	public void doSomething(final int arg) {
		//arg=6 
		/* the compiler will throw an error if we try to 
		 * change final arguments.
		 */
	}
	
	
}

public class FinalArgsAndVarExample {

	public static void main(String[] args) {
		
		final int i;
		i=5;
		//i=6; // the compiler will throw an error.
		System.out.println(i);
		
	}

}
