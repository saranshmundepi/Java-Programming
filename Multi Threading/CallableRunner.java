package com.saransh.multithreading;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		
		//Thread returning a value
		Future<String> welcomeFuture=executorService.submit(new CallableTask("Aman"));
		
		System.out.print("\nnew CallableTask(\"Aman\") executed\n");
		String welcomeMessage=welcomeFuture.get();
		System.out.println(welcomeMessage);
		System.out.print("\nMain completed");
		executorService.shutdown();
		
	}

}
