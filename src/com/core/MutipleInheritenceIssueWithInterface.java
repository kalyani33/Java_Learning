package com.core;
interface Inter1
{
	public default void Demo()
	{
		System.out.println("in Demo");
	}
}
interface Inter2
{
	public default void Demo()
	{
		System.out.println("in MyDemo");
	}
}

class MyClass implements Inter1,Inter2
{
	public void Demo()
	{
		Inter1.super.Demo();
		System.out.println("in MyClass");
	}
}
public class MutipleInheritenceIssueWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.Demo();

	}

}
