package com.sgtesing.inheritanceprograms;
abstract class Engineeringcollege
{
	abstract void collegename();
	abstract void collegeplace();
	void Branchname(String branch[])
	{
           for(int i=0;i<=branch.length-1;i++)
           {
        	   System.out.println(branch[i]);
           }
	}
}
abstract class Ambedkar extends Engineeringcollege
{
	void collegename()
	{
		String name="Ambedkar college";
		System.out.println("name of college: "+name);
	}
}
class Banglore extends Ambedkar
{
	void collegeplace()
	{
		String city="Banglore";
		System.out.println("name of city: "+city);
	}
}


public class AbstractEngineeringcollege {

	public static void main(String[] args) {
	         Banglore obj=new Banglore();
	         obj.collegename();
	         obj.collegeplace();
	         String branch[]= {"civil","cse","mech","eee"};
	         obj.Branchname(branch);
	}

}
