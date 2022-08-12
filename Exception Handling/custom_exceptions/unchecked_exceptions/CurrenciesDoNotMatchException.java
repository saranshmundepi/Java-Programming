package com.saransh.exception_handling.custom_exceptions.unchecked_exceptions;


public class CurrenciesDoNotMatchException extends RuntimeException{

	public CurrenciesDoNotMatchException(String msg)
	{
		super(msg);
	}
}
