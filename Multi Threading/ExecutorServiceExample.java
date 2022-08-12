package com.saransh.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
			ExecutorService executorService=Executors.newSingleThreadExecutor();
			//Task1 through executor service
				executorService.execute(new Task1());
			//Task2 through executor service
				executorService.execute(new Thread(new Task2()));
		
			//Task3
				System.out.print("\n Task3 kicked off\n");
				System.out.print("\n Task3 started\n");
				for(int i=301;i<=399;i++)
					System.out.print(i+" ");
				System.out.print("\n Task3 done\n");
	
		
				System.out.print("\n Main done\n");
				executorService.shutdown();
	}

}
