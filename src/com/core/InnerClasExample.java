package com.core;
/*Inner class
 * member class
 * static class
 * anonymous clas
 * 
 * */


class Outer
{
	int num;        // member varible
	int al;
	
	void peform()    // member functions
	{
		
	}
	
	class Inner     // member class             file name : Outer$Inner.class
	{
		double weight;
		void perform()
		{
			System.out.println("function in inner classs");
		}
		
	}
	
	static class StaticInner     // static member class
	{
		double weight;
		void perform()
		{
			System.out.println("function in static inner classs");
		}
		
	}
	
}
public class InnerClasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // how to access or create object for inner class
		Outer obj = new Outer();
		 /// Inner in = new Inner(); thi i not recognizable by java
		
		Outer.Inner in = obj.new Inner();
		in.perform();
		
		
		Outer.StaticInner in2 = new Outer.StaticInner();
		in2.perform();
	}

}
