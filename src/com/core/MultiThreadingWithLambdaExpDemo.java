package com.core;

public class MultiThreadingWithLambdaExpDemo {

	public static void main(String[] args) {
		//Runnable t1 = new Hi()
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
				);

	Thread t2 = new Thread(() ->
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
			);
	t1.start();
	
	try {Thread.sleep(10);}catch(Exception e) {}
	
	t2.start();

}
}


