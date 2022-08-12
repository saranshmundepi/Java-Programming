package com.saransh.multithreading;

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
	
		
		//Task1
			System.out.print("\n Task1 kicked off\n");
			Task1 task1=new Task1();
			//task1.run();//will run as a normal serial method
		
			/*If the request to set priority of the thread to 1 is accepted
			then the task1 might end at last*/
			 
			task1.setPriority(1);
			task1.start();//Will run like a thread
			
		
		//Task2
			System.out.print("\n Task2 kicked off\n");
			Thread task2Thread=new Thread(new Task2());
		
			/*If the request to set priority of the thread to 10 is accepted
			then the task2 might end at first*/ 
			
			task2Thread.setPriority(10);
			task2Thread.start();
		
		//Wait for task1 and task2 to complete
			
			task1.join();
			task2Thread.join(); 
		
		//Task3
			
			System.out.print("\n Task3 kicked off\n");
			System.out.print("\n Task3 started\n");
			for(int i=301;i<=399;i++)
				System.out.print(i+" ");
			System.out.print("\n Task3 done\n");
			
			System.out.print("\n Main done\n");
	}

}
