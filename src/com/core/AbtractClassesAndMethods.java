package com.core;
abstract class Humans
{
	public abstract void walk();
	public void perform()
	{
		//implementaion here
	}
}

class Women  extends Humans
{

	@Override
	public void walk() {                            // here we are implementing the abstract method of "Humans" class means override in other terms
		// TODO Auto-generated method stub
		System.out.println("implemeting abstract method");
	}
	
}

abstract class Men extends Humans
{
	// if we are not implementing the abstract method from Humans class then we need make "Men" s class also as abstract
}

public class AbtractClassesAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Humans obj = new Humans();  we cannot intiatate the type humans or cannot create objects becz the type humans is an abstract class
		
		Women w = new Women();
		w.walk();
		
		Humans hw = new Women();  // here I can use Humans as refernce variable but cannot create objects with HUmans
		
		// Humans hm = new Men();   this is also not possible

	}

}
