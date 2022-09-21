package com.sgtesting.stsaticprogrames;
class Staticblock
{
	static
	{
		System.out.println("this is a static block!!!");
	}
	{
		System.out.println("this is a instance blick!!!");
	}
}

public class Staticmethods {

	public static void main(String[] args) {
		Staticblock uu=new Staticblock();
		

	}

}
