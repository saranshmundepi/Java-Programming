package com.saransh.access_modifiers.package1.subpack2;

import com.saransh.access_modifiers.package1.subpack1.ExampleClass;

public class ClassA {
	public void publicMethod(){System.out.println("public");}
	protected void protectedMethod(){System.out.println("protected");}
	private void privateMethod(){System.out.println("private");}
	void defaultMethod(){System.out.println("default");}
	
	public static void main(String args[]) {
		
		ClassA classAObj=new ClassA();
		
		//Methods and variables with any access specifier can be accessed within same class
		classAObj.publicMethod();
		classAObj.protectedMethod();
		classAObj.privateMethod();
		classAObj.defaultMethod();
		
		ExampleClass exampleClassObj=new ExampleClass();
		
		exampleClassObj.publicMethod();
		//except public method other methods and variables couldn't be accessed
		//exampleClassObj.protectedMethod(); 
		//exampleClassObj.privateMethod();	
		//exampleClassObj.defaultMethod();	
		
	}
}
