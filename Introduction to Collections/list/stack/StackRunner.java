package com.saransh.collections.list.stack;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		Integer x=10;
		System.out.println("Pushing "+x+" into "+"the stack");
		stack.push(10);
		
		x=20;
		System.out.println("Pushing "+x+" into "+"the stack");
		stack.push(20);
		
		x=30;
		System.out.println("Pushing "+x+" into "+"the stack");
		stack.push(30);
		
		System.out.println("Size of the Stack:"+stack.size());
		System.out.println("Element at the top of the Stack is: "+stack.peek());
		System.out.println("Popping out the top element: "+stack.pop());
		System.out.println("Element at the top of the Stack is: "+stack.peek());
		System.out.println("The stack is empty: "+stack.isEmpty());
	}

}
