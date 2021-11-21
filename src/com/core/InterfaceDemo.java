package com.core;
/*
 * interface is same as like abstract class
 * in interface every method should only be declared but not defined
 * which ever class is implementing this interface that class must define the method
 * in abstract class we can have abstract methods as well as normla methods but in interface we can only have abtrct methods.
 * we cannot create object for interfaces but we can make use of interface as a refernce varible
 * we can achieve mutiple inheritence with interfaces
 * 
 * */
interface Abc
{
	public void perform();
	public void show();
}

class implementor implements Abc
{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj = new implementor();
		obj.show();

	}

}
