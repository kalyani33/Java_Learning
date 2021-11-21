package com.core;

class A11
{
	public void show()
	{
		System.out.println("Hello everyone");
	}
}

// if we just want to override the below method we have to create a class and override it.but we really dont need class to just override the method
// we can save the memory a well as ____ by using Anonymous class


public class AnonymousClass {
	public static void main(String args[])
	{
		A11 obj = new A11()
				{
						public void show()
						{
							System.out.println("Hello Kalyani");
						}
				};    // this is the anonymous class and it doesn't have any name, we just define it like this
	}

}
