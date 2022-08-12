package com.saransh.constructors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class MotorBike {
	
	private int speed;
	private String name;
	
	
	/*java provides a default constructor
	 * but we can edit the default constructor according to business requirement
	 */
	public MotorBike()
	{
		System.out.println("Enter the bike's name:");
		Scanner sa = new Scanner(System.in);
		String name= sa.next();
		System.out.println("Enter the speed:");
		int speed=sa.nextInt();
		sa.close();
		setName(name);
		setSpeed(speed);
	}
	
	//Defining a parameterized constructor
	public MotorBike(int speed,String name) {
		setSpeed(speed);
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name)  {

		if (name == null) {
			System.out.print("Enter valid name\n");
			return;
		}
		String regex = "^[A-Za-z][a-z]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		if (m.matches()) {
			this.name = name;
			return;
		}
		System.out.print("Enter valid name\n");
		return;
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
	}
	
	public void startBike() {
		System.out.printf("%s started\n",this.getName());
	}

}
