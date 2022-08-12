/*this example demonstrates the use of constructors*/
package com.saransh.constructors;

public class MotorbikeRunner {
	public static void main(String[] args) {
		MotorBike pulsar=new MotorBike(); //using default constructor
		MotorBike duke=new MotorBike(250,"duke");//using parameterized constructor
		
		pulsar.startBike();
		duke.startBike();
		
		System.out.printf("%s\'s speed is:%d\n",pulsar.getName(),pulsar.getSpeed());
		System.out.printf("%s's speed is: %d\n",duke.getName(),duke.getSpeed());
		
		
	
	}
	
}
