package com.sgtesting.stsaticprogrames;
class Staticvariables
{
	static String name;
	static int age;
	    static
	    {
	    	name="finish";
	    	displayname();
	    	displayage();
	    }	
		static void displayname()
		{
		      System.out.println(name);
		}
		static void displayage()
		{
			System.out.println(age);
		}
	
}

public class Staticdemo4 {

	public static void main(String[] args) {
		Staticvariables.age=34;
		System.out.println(Staticvariables.age);
		Staticvariables.displayage();
		

	}

}
