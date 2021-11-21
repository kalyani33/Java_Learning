package com.core;

/*
 * here if we create object for B class,the B constructor will by default call the A constructor also by using super keyword internally
 * as shown below,but by default it will call the default constructor only everytime if not specified externally
 * if you want to call parameterized constructor of A ,then use super.A(int i) like this
 * constructor ---> super.A(int x)
 * methods -------> super.perform()  --- > we can use in method overriding for getting super class methods
 * variables -----> super.i          ----> for getting super class variable
 * 
 * */



class A
{
	int i =121;
	public A()
	{
		System.out.println("In A constructor");
	}
	public A(int x)
	{
		System.out.println("In A constructor with int x");
	}
	public void perform()
	{
		System.out.println("A's peform");
	}
}


class B extends A
{
	int i = 100;
	public B()
	{
		super();
		// or use super(5);
		System.out.println("In b constructor");
	}
	public B(int x)
	{
		super(x);
		System.out.println("In B constructor with int x");
	}
	
	@Override // use this annotation to avoid logical errors,if our intention i to override and if u make any mistake in naming the crct function name a
	          // as super class then it will be a logical error.But if u use override anotaion java will preent this mistake a compile error
	public void perform()   // method overriding 
	{
		super.perform();       //calling super class methos
		System.out.println(i);       // calling local class variable
		System.out.println(super.i); // calling super class variable
		System.out.println("B's peform");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1 = new B();
		B obj2 = new B(10);
		obj1.perform();

	}

}
