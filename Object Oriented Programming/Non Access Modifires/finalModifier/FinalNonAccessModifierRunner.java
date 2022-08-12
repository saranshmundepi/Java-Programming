package com.saransh.nonAccessModifires.finalModifier;

//whenever we do not wan't to allow any modification of a class we use final
final class FinalClass{
	
}

// Any class could not extend a final class
//class SomeClass extends FinalClass{}

class ParentClass{
	//A final method can not be over ridden

	private final int constA=10;
	/*	A private final field can not be assigned any value
	 *  within the class after initialization.
	 */
	public final int constB=20;
	/* A public final field can not be assigned any value 
	 * within the whole program after initialization.
	 * 
	 */
	final public void returnMessage(String str) {
		System.out.println("Message: "+str);
	}
	
	void setConstA(int i) {
		//constA=i; 
		/* The compiler will throw an error
		 * that final field can not be assigned
		 */
	}
	int getConstA() {
		return constA;
	}
}

class ChildClass extends ParentClass {
	
	/*Compiler will throw an error: final method can not be over-ridden
	final public void returnMessage(String str) {
		
	}
	*/
	
	//But a final method can be overloaded
	final public void returnMessage(int i) {
		System.out.println(i);
	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {

		ParentClass obj=new ParentClass();
		System.out.println(obj.getConstA());
		
		//obj.constB=10;
		
		/* The compiler will throw an error
		 * that final field can not be assigned
		 */

	}

}
