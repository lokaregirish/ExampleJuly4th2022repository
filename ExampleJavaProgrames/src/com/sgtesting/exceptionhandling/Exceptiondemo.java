package com.sgtesting.exceptionhandling;
class BasicMaths
{
	static void Addition(int x,int y)
	{
		try 
		{
			int res=x+y;
			System.out.println("addition result: "+res);
		}catch (ArithmeticException m)
		{
			m.printStackTrace();
		}
    }
	static void isEvennumber(int x)
	{
		try
		{
			if(x%2==0)
			{
				System.out.println("Given number is a even number");
			}

		}catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void Oddnumber(int x)
	{
		try
		{
			if(x%2==1)
			{
				System.out.println("Given number is odd number");
			}

		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void division(int x,int y)
	{
		try
		{
			int res=x/y;
			System.out.println("division result: "+res);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void Multiplication(int x,int y)
	{
		try
		{
			int res=x*y;
			System.out.println(res);
		}catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
}

public class Exceptiondemo {

	public static void main(String[] args) {
		BasicMaths.Addition(12, 34);
		BasicMaths.isEvennumber(124);
		BasicMaths.Oddnumber(13);
		BasicMaths.division(25, 0);
		BasicMaths.Multiplication(12, 2);

	}

}
