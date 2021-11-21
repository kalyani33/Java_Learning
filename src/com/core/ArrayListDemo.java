package com.core;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int rollNo;
	String Name;
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// li1 can only store stirng objects
		ArrayList<String> li1 = new ArrayList<>();
		
		// li2 can store any type of object
		ArrayList li2 = new ArrayList();
		Student s1 = new Student();
		s1.Name= "kalyani Reddy";
		s1.rollNo = 539;
		
		li1.add("kalyani");
		li2.add("neel Amstrong");
		li1.add("Add dupicate as well");
		li1.add("Newton");
		// li1.add(12); not possible becz our arraylist is of type string
		li1.add("jack");
		li1.add("jame");
		
		
		li2.add(11);
		li2.add("U can Add Any Type");
		li2.add(2.2);
		li2.add(true);
		li2.add(s1);

		String name = li1.get(3);
		System.out.println("Name of a person from list1 is: "+name);
		
		Object o = li2.get(2);
		System.out.println("o is: "+o);

		System.out.println(li1);
		System.out.println(li2);
		
		li1.set(2,"NewName");
		
		li1.remove(3);
		System.out.println("list size is: "+li1.size());
		
		// li1.clear(); - > remove all
		
		if(li1.contains("jack"))
		{
			System.out.println("Jack is n list");
		}
		
		// iterate list
		
		for(String s:li1)
			System.out.println(s);
		
		// iterate with iterator
		System.out.println("====== Iteratring with Itertaor =========");
		Iterator<String> itr = li1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			if(itr.next().equals("kalyani"))
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(li1);
		

	}

}
