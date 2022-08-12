package com.saransh.composition;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress=new Address("BEML Layout","Hyd","500035"); //initializing homeAddress
		Customer customer=new Customer("Aman",homeAddress);			   //initializing customer
		Address workAddress=new Address("whiteField","Hyd","500035");  //initializing workAddress
		customer.setWorkingAdderss(workAddress);					   //adding workAddress of the customer
		System.out.println(customer.toString());						
	}

}
