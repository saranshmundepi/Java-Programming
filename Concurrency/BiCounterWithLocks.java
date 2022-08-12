package com.saransh.concurrency;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLocks {
	
	private int i=0;
	private int j=0;
	
	Lock lockForI=new ReentrantLock();
	Lock lockForJ=new ReentrantLock();
	
	 public void incrementI() {
		//Get lock for i
		lockForI.lock();
		i++;
		lockForI.unlock();
		//release Lock for i
	}
	 public void incrementJ() {
		//Get lock for j
		lockForJ.lock();
		j++;
		lockForJ.unlock();
		
		//release Lock for j
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}

}
