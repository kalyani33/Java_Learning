package com.core;
class Example
{
int perform(int ...n)  // take arguments as array ---> this is called variable length arguments
	{
		int sum =0;
		for (int i : n)
		{
			sum += i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example emp = new Example();
		emp.perform(3,45,2,6,1,12,14,90,33,23); // here I can pass as many arguments as possible
	}

}
