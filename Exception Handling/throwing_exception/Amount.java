package com.saransh.exception_handling.throwing_exception;

public class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency,int amount)
	{
		super();
		this.currency=currency;
		this.amount=amount;
	}
	public void add(Amount that) throws Exception{
		if(!this.currency.equals(that.currency)) {
			throw new Exception("Currencies don't match "+this.currency+" != "+that.currency);
		}
		this.amount=this.amount+that.amount;
	}
	
	public String toString() {
		return amount +" "+ currency;
	}
}
