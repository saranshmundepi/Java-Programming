package com.saranshmundepi.programming.wrapper_classes;
/*Wrapper class provide objects of primitive data types,
 * which is useful when working with classes in java.util package
 * ,specially collection framework. They are needed to support
 * synchronization in multi-threaded environment.
 */
public class WrappperClasses {

	public static void main(String[] args) {

			Character chrObj; 	char chr;
			Byte bytObj;		byte byt;
			Short shrtObj;		short shrt;
			Integer intgrObj;	int intgr;
			Long lngObj;		long lng;
			Float fltObj;		float flt;
			Double dblObj;		double dbl;
			Boolean blnObj;		boolean bln;
			
			
			
			chrObj='A';//Auto-boxing
			System.out.println("Value in chrObj: "+chrObj+"\nSize of chrObj: "+Character.SIZE);

			chr=chrObj;//Un-boxing
			System.out.println("Value in chr: "+chr);
			
			bytObj=1;//Auto-boxing
			System.out.println("\nValue in bytObj: "+bytObj+"\nSize of bytObj: "+Byte.SIZE+"\nMin Value of bytObj: "+Byte.MIN_VALUE+"\nMax Value of bytObj: "+Byte.MAX_VALUE);
			byt=bytObj;//Un-boxing
			System.out.println("Value in byt: "+byt);
			
			shrtObj=3;//Auto-boxing
			System.out.println("\nValue in shrtObj: "+shrtObj+"\nSize of shrtObj: "+Short.SIZE+"\nMin Value of shrtObj: "+Short.MIN_VALUE+"\nMax Value of shrtObj: "+Short.MAX_VALUE);
			shrt=shrtObj;//Un-boxing
			System.out.println("Value in shrt: "+shrt);
			
			intgrObj=5;//Auto-boxing
			System.out.println("\nValue in intgrObj: "+intgrObj+"\nSize of intgrObj: "+Integer.SIZE+"\nMin Value of intgrObj: "+Integer.MIN_VALUE+"\nMax Value of intgrObj: "+Integer.MAX_VALUE);
			intgr=intgrObj;//Un-boxing
			System.out.println("Value in intgr: "+intgr);
			
			lngObj=7l;//Auto-boxing
			System.out.println("\nValue in lngObj: "+lngObj+"\nSize of lngObj: "+Long.SIZE+"\nMin Value of lngObj: "+Long.MIN_VALUE+"\nMax Value of lngObj: "+Long.MAX_VALUE);
			lng=lngObj;//Un-boxing
			System.out.println("Value in lng: "+lng);
			
			fltObj=1.0f;//Auto-boxing
			System.out.println("\nValue in fltObj: "+fltObj+"\nSize of fltObj: "+Float.SIZE+"\nMin Value of fltObj: "+Float.MIN_VALUE+"\nMax Value of fltObj: "+Float.MAX_VALUE);
			flt=fltObj;//Un-boxing
			System.out.println("Value in flt: "+flt);
			
			dblObj=3.0;//Auto-boxing
			System.out.println("\nValue in dblObj: "+dblObj+"\nSize of dblObj: "+Double.SIZE+"\nMin Value of dblObj: "+Double.MIN_VALUE+"\nMax Value of dblObj: "+Double.MAX_VALUE);
			dbl=dblObj;//Un-boxing
			System.out.println("Value in dbl: "+dbl);
			
			blnObj=true;//Auto-boxing
			System.out.println("\nValue in blnObj: "+blnObj);
			bln=blnObj;//Un-boxing
			System.out.println("Value in bln: "+bln);		
			
			
	}

}
