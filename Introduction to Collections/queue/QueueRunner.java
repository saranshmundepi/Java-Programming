package com.saransh.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueRunner {
	public static void main(String[] args) {
		
		List<String> list=List.of("Pat","Lad","Cat","Hat","Mat");
		Queue<String> queue=new LinkedList<>();
		
		for(String x:list) {
			queue.offer(x);
		}
		
		/*The element of queue are arranged in
		 * the same order of their insertion
		 */
		
		Iterator<String> it2= queue.iterator();
		while(it2.hasNext()) {
			System.out.println(queue);
			System.out.println(queue.poll());
			System.out.println();
		}
		
	}
}
