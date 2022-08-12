package com.saransh.access_modifiers.package1.subpack1;

public class ExampleClass {
	
	public void publicMethod(){
		System.out.println("public");
		this.privateMethod();
		}
	
	protected void protectedMethod(){
		System.out.println("protected");
		this.privateMethod();
		}
	
	private void privateMethod(){
		System.out.println("private method accessed through public,protected or default method");
		}
	
	void defaultMethod(){
		System.out.println("default");
		}
}

