package com.saransh.exception_handling.custom_exceptions.unchecked_exceptions;

public class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency,int amount)
	{
		super();
		this.currency=currency;
		this.amount=amount;
	}
	public void add(Amount that) {	//There is no need to throw a Runtime exception
		if(!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies don't match "+this.currency+" != "+that.currency);
		}
		this.amount=this.amount+that.amount;
	}
	
	public String toString() {
		return amount +" "+ currency;
	}
}
