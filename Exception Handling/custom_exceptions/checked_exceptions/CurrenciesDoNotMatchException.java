package com.saransh.exception_handling.custom_exceptions.checked_exceptions;


public class CurrenciesDoNotMatchException extends Exception{

	public CurrenciesDoNotMatchException(String msg)
	{
		super(msg);
	}
}
