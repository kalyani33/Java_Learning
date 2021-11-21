package com.core;
/*
 * 3 types of interface
 * 1.normal interface -- which has multiple abstract methods
 * 2.Single abstract method SAM interface -- which has only one method -- functional interface -- lambda expression
 * 3. marker interface -- which doesn't have any methods eg: serializable interface
 * 
 * 
 * */

interface One            // functional interface
{
	public void show();
}
public class FunctionalInterfaceWithLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One obj = () -> System.out.println("I'm the best");   // lamdba expression -- > works only for functional interface

	}

}
