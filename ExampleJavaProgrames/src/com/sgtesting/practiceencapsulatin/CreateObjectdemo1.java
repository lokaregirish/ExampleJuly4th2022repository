package com.sgtesting.practiceencapsulatin;
class Fruits
{
	String fruitname;
	int fruitcost;
	String cityname;
}

class Vegetables
{
	String vegetablename;
	int vegetablecost;
	String cityname;
}
 
class Flowers
{
	String flowertname;
	int flowercost;
	String cityname;
}

public class CreateObjectdemo1 {


	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		obj1.fruitname="apple";
		obj1.fruitcost=25;
		obj1.cityname="mumbai";
		System.out.println("fruit name:"+obj1.fruitname+" cost:"+obj1.fruitcost+" cityname:"+obj1.cityname);
		System.out.println("++++++++++++++++++");
		Vegetables cucumber=new Vegetables();
		cucumber.vegetablename="cucumber";
		cucumber.vegetablecost=25;
		cucumber.cityname="raichur";
		System.out.println("vegetable name:"+cucumber.vegetablename+" cost:"+cucumber.vegetablecost+" cityname:"+cucumber.cityname);
		System.out.println("++++++++++++++++++");
		Flowers lily=new Flowers();
		lily.flowertname="lily";
		lily.flowercost=55;
		lily.cityname="banglore";
		System.out.println("flower name:"+lily.flowertname+" cost:"+lily.flowercost+" cityname:"+lily.cityname);
		System.out.println("++++++++++++++++++");
		
		
		
	}

}
