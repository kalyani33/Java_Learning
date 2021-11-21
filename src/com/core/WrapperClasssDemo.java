package com.core;

public class WrapperClasssDemo {

	public static void main(String[] args) {
		
		int i = 5; // primitive datatype
		Integer ii = new Integer(i);  // boxing or wrapping
		
		int j = ii.intValue();  //unboxing or unwrapping
		
		Integer value = i;  // autoBoxing  here u dont need to write Integer value = new Integer(i);
		
		int k = value; //autounboxing    here u dont need to write int k = ii.intValue(); 
		
		
		// primitives are faster
		// but going forward we use wrapper classes
		
		String s = "123";
		
		int n = Integer.parseInt(s);

	}

}
