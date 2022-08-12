package com.saransh.concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		
		Counter counter=new Counter();
		counter.increment();
		counter.increment();
		counter.increment();

	}

}
