package com.saransh.multithreading;

public class Task extends Thread{
	
	private int number;
	
	public Task(int number) {
		this.number=number;
	}
	
	public void run() {
		
		System.out.print("\n Task"+number+" started\n");
		for(int i=number*100;i<=number*100+99;i++)
			System.out.print(i+" ");
		System.out.print("\n Task"+number+" done\n");
		
	}
	
}
