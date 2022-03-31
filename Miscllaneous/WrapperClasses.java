package com.naman;

public class WrapperClasses {

	public static void main(String[] args) {
		int i =5; // Primitive Datatype
		Integer ii = new Integer(i); // Boxing - Wrapping
		
		int j = ii.intValue(); // Unboxing- unwrapping
		
		Integer value = i; // Autoboxing;
		int k = value; // Autounboxing
		System.out.println(k);
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);

	}

}
