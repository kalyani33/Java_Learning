package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//collection and generic
// provides dynamic array
// use itertor or enchanced for loop to fetch values from ArrayList

public class CollectionGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> values = new ArrayList<Object>();
		
		values.add(12);
		values.add("kalyani");
		values.add(1.2f);
		
//		Iterator i = values.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(Object i : values)
		{
			System.out.println(i);
		}
		

	}

}
