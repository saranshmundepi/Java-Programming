package com.saransh.understandingclasses;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan=new Fan("Manufacturer 1", 0.34567,"GREEN"); //Instantiating object of class Fan using constructor
		fan.switchOn();										//invoking methods using the object of the class Fan
		fan.setSpeed((byte) 5);
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());

	}

}
