package com.saransh.collections.queue.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeRunner {

	public static void main(String[] args) {


		Deque<Integer> d =new LinkedList<Integer>();
		
		Integer x=10;
		System.out.println("Adding element "+x+" at the front of the Deque ");
		d.offerFirst(x);
		

		x=20;
		System.out.println("Adding element "+x+" at the rear of the Deque ");
		d.offerLast(x);
		
		x=5;
		System.out.println("Adding element "+x+" at the front of the Deque ");
		d.offerFirst(x);
		
		x=15;
		System.out.println("Adding element "+x+" at the rear of the Deque ");
		d.offerLast(x);
		
		System.out.println("Deque is: "+d);
		
		System.out.println("The element at front is: "+d.peekFirst());
		System.out.println("The element at rear is: "+d.peekLast());
		
		System.out.println("Removing the first element");
		d.pollFirst();
		System.out.println("Removing the last element");
		d.pollLast();
		
		System.out.println("The element at front is: "+d.peekFirst());
		System.out.println("The element at rear is: "+d.peekLast());
	}

}
