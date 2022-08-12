package com.saransh.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadPoolExample {

	public static void main(String[] args) {
			ExecutorService executorService=Executors.newFixedThreadPool(2);
			executorService.execute(new Task(1));
			executorService.execute(new Task(2));
			executorService.execute(new Task(3));
			executorService.execute(new Task(4));
			executorService.execute(new Task(5));
			executorService.execute(new Task(6));
			executorService.execute(new Task(7));
		
			System.out.print("\n Main done\n");
			executorService.shutdown();
	}

}
