package com.saransh.access_modifiers.package1.subpack2;

import com.saransh.access_modifiers.package1.subpack1.ExampleClass;

public class NonSubClassOutOfPackage {
	
	public static void main(String[] args) {
		
		ExampleClass exampleClassObj=new ExampleClass();
		
		exampleClassObj.publicMethod();
		
		//Only public methods and variables out of the same package are accessible to non subclasses */
		//exampleClassObj.protectedMethod(); 
		//classBObj.privateMethod();	
		//exampleClassObj.defaultMethod();
		
	}
	
}
