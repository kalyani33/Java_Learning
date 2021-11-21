package com.core;

interface Kalyani
{
	public void show(); // we can implement thi method without implementing the interface by using anonymous class
}
public class AnonymousWIthInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kalyani k = new Kalyani()
				{
			  		public void show()
			  		{
			  			System.out.println("Hello everybody");
			  		}
				};   // without creating another object of a class, we can override methods by using anonymous class
					// anonymous class doesn't have any name

	}

}
