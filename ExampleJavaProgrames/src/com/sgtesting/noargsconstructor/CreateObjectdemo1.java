package com.sgtesting.noargsconstructor;
class Fruits
{
	String fruitname;
	int fruitcost;
	String cityname;
	
	Fruits()
	{
		fruitname="apple";
		fruitcost=25;
		cityname="mumbai";
		System.out.println("fruit name:"+fruitname+" cost:"+fruitcost+" cityname:"+cityname);
		System.out.println("++++++++++++++++++");	
	}
}

class Vegetables
{
	String vegetablename;
	int vegetablecost;
	String cityname;
	
	Vegetables()
	{
		vegetablename="cucumber";
		vegetablecost=25;
		cityname="raichur";
		System.out.println("vegetable name:"+vegetablename+" cost:"+vegetablecost+" cityname:"+cityname);
		System.out.println("++++++++++++++++++");	
	}
	
}
 
class Flowers
{
	String flowertname;
	int flowercost;
	String cityname;
	
	Flowers()
	{
		flowertname="lily";
		flowercost=55;
		cityname="banglore";
		System.out.println("flower name:"+flowertname+" cost:"+flowercost+" cityname:"+cityname);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo1 {


	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		
		Vegetables cucumber=new Vegetables();
		
		Flowers lily=new Flowers();
		
		
		
		
	}

}
