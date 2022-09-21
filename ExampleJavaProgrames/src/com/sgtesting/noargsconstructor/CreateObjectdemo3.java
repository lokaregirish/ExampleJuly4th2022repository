package com.sgtesting.noargsconstructor;
class Twowheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Twowheeler()
	{
		vehiclename="apache";
		vehiclecost=250000;
		noofwheels=2;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}

class Fourwheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Fourwheeler()
	{
		vehiclename="Santro car";
		vehiclecost=2500000;
		noofwheels=4;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Heavyvehicle
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Heavyvehicle()
	{
		vehiclename="lorry";
		vehiclecost=8000000;
		noofwheels=16;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo3 {


	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler();
		
		Fourwheeler car=new Fourwheeler();
		
		Heavyvehicle lorry=new Heavyvehicle();
		
		
		
		
	}

}
