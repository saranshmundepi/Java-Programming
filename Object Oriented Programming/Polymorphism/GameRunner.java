package com.saransh.polymorphism;

import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {

		GamingConsole game = null;
		Scanner gsc=new Scanner(System.in);
		boolean menuExit=false;
		do {
			System.out.printf("Select Game:\n1)Mario\n2)RoadRash\n3)exit");
			String gchoice=gsc.next();
			switch(gchoice) {
			case "1":
				game=new MarioGame();	//Run time polymorphism
				menuExit=true;
				break;
			case "2":
				game=new RoadRash();	//Run time polymorphism
				menuExit=true;
				break;
			case "3":
				menuExit=true;
				break;
			default:
				break;
			}
		
		}while(!menuExit);		
		
		String choice;
		System.out.println("Press Keys");
		do {
		choice=gsc.next();
			
		switch(choice) {
			case "up":
				game.up();
				break;
			case "down":
				game.down();
				break;
			case "left":
				game.left();
				break;	
			case "right":
				game.right();
				break;
			case "a":
				game.a();
				break;
			case "b":
				game.b();
				break;
			case "x":
				game.x();
				break;
			case "y":
				game.y();
				break;
			default:
	
				break;
			}
		
		}while(choice!="exit");
		gsc.close();
	}	
}
	
		
