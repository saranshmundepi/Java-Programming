package com.saransh.multithreading;
//implementing Runnable

class Task2 implements Runnable{
	public void run() {
		//Task1
		System.out.print("\n Task2 started\n");
		for(int i=201;i<=299;i++)
			System.out.print(i+" ");
		System.out.print("\n Task2 done\n");
	}
	
}