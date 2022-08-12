package com.saransh.collections.queue.priority_queue;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRunner {

	public static void main(String[] args) {
			
		
		Queue<String> queue1=new PriorityQueue<>();
		List<String> list=List.of("Pat","Lad","Cat","Hat","Mat");
		
		queue1.addAll(list);
		
		/*The smallest element is the first element
		 *  of the priority queue, rest of the queue may or
		 *  may not be in an order as it is implemented 
		 *  using heap data structure.
		 */
		
		System.out.println("Queue priortizing lower values");
		
		Iterator<String> it= queue1.iterator();
		while(it.hasNext()) {
			System.out.println(queue1);
			System.out.println(queue1.poll());
			System.out.println();
		}
		
		System.out.println("Queue priortizing higher values");
		
		/*Changing the priority by passing instance of Comparator
		 * the the constructor of priority queue
		 */
		Queue<String> queue2=new PriorityQueue<>(new StringComparator());
		
		for(String x:list) {
			queue2.offer(x);
		}
		
		Iterator<String> it2= queue2.iterator();
		while(it2.hasNext()) {
			System.out.println(queue2);
			System.out.println(queue2.poll());
			System.out.println();
		}
	
	}

}
