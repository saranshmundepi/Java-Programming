package com.saransh.multithreading;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		List<CallableTask> list=List.of(new CallableTask("Aman"),new CallableTask("Shivam"),new CallableTask("Hitesh"));
		
		//waiting for all the tasks to be done
		List<Future<String>> results=executorService.invokeAll(list);
		
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		
		System.out.println("Main ends");
		
		executorService.shutdown();

	}

}
