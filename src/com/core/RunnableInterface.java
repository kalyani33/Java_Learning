package com.core;
class Hi1 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
		System.out.println("Hi");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class Hello1 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
		System.out.println("Hello " + Thread.currentThread().getPriority());
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

public class RunnableInterface  {

	public static void main(String[] args)throws Exception {
		
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		
		Thread t1 = new Thread(obj1,"Hi Thread");
		Thread t2 = new Thread(obj2,"Hello Thread");
		
		//System.out.println(t1.isAlive());
		t1.setName("Hi Thread");
		System.out.println(t2.getName());
		System.out.println(t1.getName());
		t1.setPriority(1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		
		System.out.println("Bye from Main Thread");
		

	}

}
