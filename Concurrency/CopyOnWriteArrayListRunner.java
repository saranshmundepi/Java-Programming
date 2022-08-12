package com.saransh.concurrency;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {


		List<String> list =new CopyOnWriteArrayList<String>();
		
		//add: synchronized, copy of the DataStructure is made
		//get: not synchronized
		
		
		
		//Writing Threads =3
		List<String> threadInputList=List.of("Ant","Bat","Cat");//Simulating 1 input from each thread
		
		for(String str:threadInputList) {
			list.add(str);
		}

		//Reading threads = 1000
		for(int i=1;i<=1000;i++)
		{
			System.out.print(i+")");
			for(String element:list) {
				System.out.print(element+" ");
			}
			System.out.println();
			
		}
	}

}
