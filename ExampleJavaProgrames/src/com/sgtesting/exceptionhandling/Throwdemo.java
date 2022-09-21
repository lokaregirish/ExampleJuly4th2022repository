package com.sgtesting.exceptionhandling;
class Maths2
{
	int Displayname(String name)throws Exception
	{
		if(name==null)
		{
			throw new Exception("pls provide valid input");
		}
		return name.length();
	}
}

public class Throwdemo {

	public static void main(String[] args) {
		Maths2 kk=new Maths2();
		try 
		{
		     int y=kk.Displayname("jinka");
		     System.out.println(y);
		     int u=kk.Displayname(null);
		     System.out.println(u);
		}catch(Exception r)
		{
			System.out.println(r);
		}

	}

}
