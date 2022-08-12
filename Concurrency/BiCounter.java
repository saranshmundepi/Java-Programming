package com.saransh.concurrency;

public class BiCounter {
	
	private int i=0;
	private int j=0;
	/*Only one thread would be able to access any
	 * of the synchronized critical sections, even
	 * though they are mutually exclusive.
	 */
	
	/*if there are thousands of such synchronized functions
	 * then the performance may get heavily impacted, so we
	 * need a work around.
	 */
	synchronized public void incrementI() {
		i++;
		//get i
		//increment
		//set i
	}
	synchronized public void incrementJ() {
		i++;
		//get j
		//increment
		//set j
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}

}
