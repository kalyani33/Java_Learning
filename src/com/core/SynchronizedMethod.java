package com.core;
class Counter
{
	int count ;
	public synchronized void increment()
	{
		count++;
	}
}
public class SynchronizedMethod {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<5; i++)
			{
				c.count++;
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
				);

	Thread t2 = new Thread(() ->
	{
		for(int i=0; i<5; i++)
		{
			c.count++;
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
			);
	t1.start();
	
	try {Thread.sleep(10);}catch(Exception e) {}
	
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("Count: "+c.count);

	}

}
