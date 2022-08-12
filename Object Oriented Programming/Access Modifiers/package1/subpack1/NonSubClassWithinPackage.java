package com.saransh.access_modifiers.package1.subpack1;

public class NonSubClassWithinPackage {
	
	public static void main(String[] args) {
		
		ExampleClass classBObj =new ExampleClass();
		
		classBObj.publicMethod();
		classBObj.protectedMethod(); 
		classBObj.defaultMethod();
		
		//Only private methods and variables within same package are not accessible to non subclasses */
		//classBObj.privateMethod();	
									
	}
	
}
