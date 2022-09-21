package com.sgtesting.stsaticprogrames;
class Maths
{
	static String name;
	static int age;
	static void addition(int x,int y)
	{
	      int res=x+y;
	      System.out.println(res);
	}
	
}

public class Staticdemo2 {

	public static void main(String[] args) {
		Maths.name="giri";
		Maths.age=27;
		Maths.addition(25, 67);
		System.out.println(Maths.name);
		System.out.println(Maths.age);
		
		

	}

}
