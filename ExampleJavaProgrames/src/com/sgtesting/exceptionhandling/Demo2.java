package com.sgtesting.exceptionhandling;
class Maths
{
	void division(int x,int y)
	{
		try 
		{
			int div=x/y;
			System.out.println(div);	
		}catch(Throwable e)
		{
			System.out.println(e.getMessage());
			// or we can use System.out.println(e);
			//and also in  the place of throwable we can use Exception
		}
		 
	}
	void Mult(int x,int y)
	{
		int mult=x*y;
		System.out.println(mult);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		Maths oo=new Maths();
		oo.division(25, 0);
		oo.Mult(2, 2);

	}

}
