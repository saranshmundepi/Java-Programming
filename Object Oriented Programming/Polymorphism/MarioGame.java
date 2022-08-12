package com.saransh.polymorphism;

//MarioGame class Implementing the GamingConsole interface according to its requirements
public class MarioGame implements GamingConsole{
	//ACHIEVING POLYMORPHISM THROUGH OVERRIDING METHODS
	@Override
	public void up() {					
		
		System.out.println("move up");
	}

	@Override							
	public void down() {
		
		System.out.println("move down");
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
		
		System.out.println("jump");
	}

	@Override							
	public void b() {
		
		System.out.println("high jump");
	}

	@Override							
	public void x() {
		System.out.println("run");
		
	}
										
	@Override
	public void y() {
		
		System.out.println("fireball");
	}

}
