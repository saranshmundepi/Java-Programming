package com.saransh.composition;

//Defining Address class with its fields and methods
public class Address {
	private String line1;
	private String city;
	private String zip;
	
	
	
	public Address(String line1, String city, String zip) {
		super();
		setLine1(line1);
		setCity(city);
		setZip(zip);
	}
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
}
