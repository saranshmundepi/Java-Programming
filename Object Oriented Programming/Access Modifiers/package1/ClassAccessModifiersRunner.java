package com.saransh.access_modifiers.package1;

import com.saransh.access_modifiers.package2.PublicClassInPack2;

public class ClassAccessModifiersRunner {

	//public, protected, (default), private
	public static void main(String[] args) {
		
		PublicClassInPack2 a = new PublicClassInPack2();
		//DeafultClassInPack2 b= new DeafultClassInPack2();
		System.out.println(a.toString()+" \n"/*+b.toString()*/);
		
	}

}

