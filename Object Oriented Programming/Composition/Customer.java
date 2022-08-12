package com.saransh.composition;

//Defining Customer class with its fields and methods
public class Customer {
	
	private String name;
	
	private Address homeAddress;		//Customer class is composed of Address class
	private Address workingAdderss;
	
	
	public Customer(String name, Address homeAddress) {
		super();
		setName(name);
		setHomeAdderss(homeAddress);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getHomeAdderss() {
		return homeAddress;
	}
	
	public void setHomeAdderss(Address homeAdderss) {
		this.homeAddress = homeAdderss;
	}
	
	public Address getWorkingAdderss() {
		return workingAdderss;
	}
	
	public void setWorkingAdderss(Address workingAdderss) {
		this.workingAdderss = workingAdderss;
	}
	
	public String toString() {
		return String.format("name: [%s]\t home address: [%s]\t working address: [%s]",name,homeAddress,workingAdderss);
	}
	

}
