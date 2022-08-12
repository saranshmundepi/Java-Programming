package com.saransh.access_modifiers.package1.subpack2;

import com.saransh.access_modifiers.package1.subpack1.ExampleClass;

public class SubClassOutOfPackage extends ExampleClass{
	
	public static void main(String[] args) {
		
		//ExampleClass exampleClassObj=new ExampleClass();
		
		SubClassOutOfPackage exampleClassObj=new SubClassOutOfPackage();
		
		exampleClassObj.publicMethod();
		exampleClassObj.protectedMethod(); 
		
		
		//Only public and protected methods and variables within same package are accessible to subclasses */
		//exampleClassObj.defaultMethod();
		//classBObj.privateMethod();	
		
	}
	
}
