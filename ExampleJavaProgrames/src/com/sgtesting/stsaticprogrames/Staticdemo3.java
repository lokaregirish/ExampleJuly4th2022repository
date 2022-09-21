package com.sgtesting.stsaticprogrames;
class Addition
{
	static String name;
	static int age;
	static
	{
		name="girish";
		System.out.println(name);
		int y=substraction(15,10);
		System.out.println(y);
	}
   static int substraction(int x,int y)
   {
	   int res=x-y;
	   return res;
   }
}

public class Staticdemo3 {

	public static void main(String[] args) {
		//Addition mm=new Addition();
		Maths.age=27;
		System.out.println(Maths.age);
		//int y=Addition.substraction(30,5);
		//System.out.println(y);

	}

}
