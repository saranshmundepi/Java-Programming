package com.saransh.multithreading;
import java.util.concurrent.Callable;

/* Callable interface is used to create a task that 
 * returns a result and may throw an exception.
 */
public class CallableTask implements Callable<String> {

	private String name;
	
	public CallableTask(String name) {
		this.name=name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+name;
		
	}

}
