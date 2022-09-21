package com.sgtesting.parameterizedconstructor;
class Fruits
{
	String fruitname;
	int fruitcost;
	String cityname;
	
	Fruits(String fn,int Fr,String cn)
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
	
	Vegetables(String vn,int ve,String cn)
	{
		vegetablename=vn;
		vegetablecost=ve;
		cityname=cn;
		System.out.println("vegetable name:"+vegetablename+" cost:"+vegetablecost+" cityname:"+cityname);
		System.out.println("++++++++++++++++++");	
	}
	
}
 
class Flowers
{
	String flowertname;
	int flowercost;
	String cityname;
	
	Flowers(String fn,int fl,String cn)
	{
		flowertname=fn;
		flowercost=fl;
		cityname=cn;
		System.out.println("flower name:"+flowertname+" cost:"+flowercost+" cityname:"+cityname);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo1 {


	public static void main(String[] args) {
		Fruits obj1=new Fruits("apple",25,"mumbai");
		
		Vegetables cucumber=new Vegetables("cucumber",25,"raichur");
		
		Flowers lily=new Flowers("lily",55,"banglore");
		
		
		
		
	}

}
