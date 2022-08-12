package com.saranshmundepi.programming;

import java.math.BigDecimal;

public class BigDecimalDemo {
	
	public static void main(String args[])	{
		double a=35.56789876;
		double b=34.2234;
		System.out.printf("a=%f \t b=%f \ta + b =%f\n",a,b,a+b);
		System.out.println("Operations on double floating no. results inaccurate results");
		System.out.println("So we use BigDecimal Class for such operations");
		BigDecimal num1=new BigDecimal("1234.456789");
		BigDecimal num2=new BigDecimal("765.5432111");
		BigDecimal num3=num1.add(num2);
		System.out.printf("a=%s\tb=%s\ta + b =%s",num1.toString(),num2.toString(),num3.toString());
	
		}
	}
	
