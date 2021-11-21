package com.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> hm = new HashMap<>();
		
//		hm.add(39,"Kalyani");
		hm.put(39, "Kalyani12");
		hm.put(39, "Kalyani");
		hm.put(1, "Laptop");
		hm.put(11, "Mackbook Pro");
		
		Set<Integer> keys = hm.keySet();
		for(int key : keys)
		{
			System.out.println("values are, "+hm.get(key));
		}
//		for(Map.Entry m : hm.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
//		hm.entrySet()
		
//		Iterator<> itr = hm.

	}

}
