package com.core;
/*
 * class : if a class is final then that class is not inheritable
 * Methods : if a method is declared as final then method can be overridden by any other method of subclass
 * variables : if a variable is declared as final then we cannot assign any other value to it.It become constant
 * 
 * */

final class PI
{
	
}

class PI2 extends PI
{
	//this is not be posible
}

class example
{
	final int i = 0;
	final public void perform()
	{
		i = 10 ; // not possible bcz final varibles cannot be re assigned
	}
}

class ex2 extends example
{
	@Override
	public void perform()
	{
		// this is not posible becz final methods cannot be overridden
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
