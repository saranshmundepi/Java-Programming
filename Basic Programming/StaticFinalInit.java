package com.saranshmundepi.programming;

public class StaticFinalInit {
	static{
		abc=10;
	}
	
	
	static final int abc; //not initializing final at the declaration using static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abc);

	}

}
