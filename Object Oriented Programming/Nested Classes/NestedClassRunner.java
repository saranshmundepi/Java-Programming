package com.saransh.nestedClasses;

public class NestedClassRunner {
	
	int i;
	
	class InnerClass{
		public void method() {
			i=5;
		}
	}
	
	static class StaticNestedClass{
		
		static int count=0;
		static int getCount() {
			return count;
		}
	}
	
	public static void main(String[] args) {
		
		//A static nested class does not need instance of the enclosing class		
		StaticNestedClass staticNestedClass=new StaticNestedClass();
		
		//A normal nested class need an instance of enclosing class to be instantiated
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
		
		System.out.println(nestedClassRunner.i);
		innerClass.method();
		System.out.println(nestedClassRunner.i);
	}

}
