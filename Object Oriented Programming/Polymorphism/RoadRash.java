package com.saransh.polymorphism;

//MarioGame class Implementing the GamingConsole interface according to its requirements
public class RoadRash implements GamingConsole{

	//ACHIEVING POLYMORPHISM THROUGH OVERRIDING METHODS
	@Override
	public void up() {
		System.out.println("move forward");
		
	}

	@Override
	public void down() {
		System.out.println("break");
		
	}

	@Override
	public void left() {
		System.out.println("move left");
		
	}

	@Override
	public void right() {
		System.out.println("move right");
		
	}

	@Override
	public void a() {
		System.out.println("snatch object");
		
	}

	@Override
	public void b() {
		System.out.println("nitro");
		
	}

	@Override
	public void x() {
		System.out.println("left kick");
		
	}

	@Override
	public void y() {
		System.out.println("right kick");
		
	}

}
