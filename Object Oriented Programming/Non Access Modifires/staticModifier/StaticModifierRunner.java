package com.saransh.nonAccessModifires.staticModifier;

import java.util.ArrayList;

/*We use static when we want to create a single 
 * instance of member object or variable for a class
 */
class Player{
	private String name;
	private static int count=0;
	private static ArrayList<String> playersList =new ArrayList<String>();

	public Player(String name) {
		super();
		this.name = name;
		count ++;
		playersList.add(name);
	}

	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}

	public static ArrayList<String> getPlayersList() {
		return playersList;
	}
	
	
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		
		Player player1= new Player("Aman");
		Player player2= new Player("Shivam");
		Player player3= new Player("Hitesh");
		
		System.out.println(Player.getPlayersList().toString());
		System.out.println(Player.getCount());

	}

}
