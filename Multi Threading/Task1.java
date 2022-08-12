package com.saransh.multithreading;
//extending Thread

class Task1 extends Thread{
		public void run() {
		//Task1
		System.out.print("\n Task1 started\n");
		for(int i=101;i<=199;i++)
			System.out.print(i+" ");
		System.out.print("\n Task1 done\n");
	}
		
}
