package com.sgtesing.inheritanceprograms;
class AA
{
	AA(String name,String city)
	{
		System.out.println("AA name: "+name);
		System.out.println("AA city: "+city);
	}
}
class BB extends AA
{
	BB(int rollno)
	{
		super("kiran","banglore");
		System.out.println("BB roll no:"+rollno);
	}
	
}
class CC extends BB
{
	CC(int y)
	{
		super(y);
		
	}
}

public class MultilevelParameter {

	public static void main(String[] args) {
	     CC mn=new CC(25);
	     
	     

	}

}
