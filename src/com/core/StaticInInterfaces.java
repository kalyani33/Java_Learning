package com.core;
interface Demo
{
	int num=4; // in interfaces varibles are by defalut final means we cannot change or assign value to its once defined
	//in interface static method are also allowed and this methods can be accessed without creating an object, by using class name a shown below
	
	static void show()
	{
		System.out.println("in my show method");
	}
}
public class StaticInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.show();

	}

}
