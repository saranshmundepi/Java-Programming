package com.saransh.interfaces;


//Creating an interface flyable
interface Flyable{
	void fly();
}

//Implementing the interface Flyable to birds class
class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("with wings");
		
	}
	
}
//Implementing the interface Flyable to airplane class
class airplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("with fuel");
		
	}	
}

public class FlyableRunner {

	public static void main(String[] args) {
		
		Flyable[] flyingObject= {new Bird(),new airplane()};
		
		//iterating over the objects of classes implementing the interface flyable
		for(Flyable obj:flyingObject) {
			obj.fly();
		}

	}

}
