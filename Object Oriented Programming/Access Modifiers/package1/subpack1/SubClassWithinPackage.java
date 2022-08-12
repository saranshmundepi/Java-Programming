package com.saransh.access_modifiers.package1.subpack1;

public class SubClassWithinPackage extends ExampleClass{
	
	public static void main(String[] args) {
		
		ExampleClass exampleClassObj =new ExampleClass();
		
		exampleClassObj.publicMethod();
		exampleClassObj.protectedMethod(); 
		exampleClassObj.defaultMethod();
		
		//Only private methods and variables within same package are not accessible to subclasses */
		//classBObj.privateMethod();	
									
	}
	
}
