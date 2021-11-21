package com.core;
class A1
{
	public void perform()
	{
		System.out.println("A's peform");
	}
}


class B1 extends A1
{
	public void perform()   // method overriding 
	{
		System.out.println("B's peform");
	}
}

class C1 extends A1
{
	public void perform()   // method overriding 
	{
		System.out.println("C's peform");
	}
}
public class DynamicMethodDispatchRuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// compile time and runtime polymorphism
		// one ref but two objects
		
		A1 obj1 = new B1();  // runtime polymorphism
		obj1.perform();
		
		obj1 = new C1();
		obj1.perform();  // dynamic method dispatch  .... everytime we are changing method

	}

}
