package com.core;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args)
	{
		Set<Integer> values = new HashSet<>();
		// doen't provide any order ,gives unique random element form collections
		// if u want order of ele's go with treeset
		values.add(5); /*returns boolean*/
		values.add(6);
		values.add(10);
		values.add(5);
		values.add(12);
		values.add(4);
		values.add(1200);
		values.add(2);
		values.add(1111);
		
		for(int i : values)
		{
			System.out.println(i);
		}
		
		System.out.println("WOrking with treeset now");
		
		Set<Integer> tvalues = new TreeSet<>();
		tvalues.add(5); /*returns boolean*/
		tvalues.add(6);
		tvalues.add(10);
		tvalues.add(5);
		tvalues.add(12);
		tvalues.add(4);
		tvalues.add(1200);
		tvalues.add(2);
		tvalues.add(1111);
		
		for(int i : tvalues)
		{
			System.out.println(i);
		}
		
	}

}
