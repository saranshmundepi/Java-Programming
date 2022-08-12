package com.saransh.understandingclasses;

public class Fan {
	
	
	//properties
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;//1 to 5
	
	//constructor to initialize object
	public Fan(String make,double d,String color)
	{
		this.make=make;
		this.radius=d;
		this.color=color;
	}
	
	//methods defining behavior of the object
	public boolean isOn() {
		return isOn;
	}

	//getters and setters for encapsulation
	public byte getSpeed() {
		return speed;
	}


	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	public void switchOn() {
		this.isOn = true;
		this.setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);
	}
	
	//overriding toString method to print object info
	@Override
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}
	
}
