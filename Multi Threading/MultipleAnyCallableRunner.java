package com.saransh.multithreading;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		List<CallableTask> list=List.of(new CallableTask("Aman"),new CallableTask("Shivam"),new CallableTask("Hitesh"));
		
		//Waiting for the fastest task
		String result=executorService.invokeAny(list);
		
		System.out.println(result);
		
		executorService.shutdown();

	}

}
