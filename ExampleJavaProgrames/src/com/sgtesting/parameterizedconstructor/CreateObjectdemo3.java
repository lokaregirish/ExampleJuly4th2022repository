package com.sgtesting.parameterizedconstructor;
class Twowheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Twowheeler(String vn,int vc,int no)
	{
		vehiclename=vn;
		vehiclecost=vc;
		noofwheels=no;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}

class Fourwheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Fourwheeler(String vn,int vc,int no)
	{
		vehiclename=vn;
		vehiclecost=vc;
		noofwheels=no;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Heavyvehicle
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
	
	Heavyvehicle(String vn,int vc,int no)
	{
		vehiclename=vn;
		vehiclecost=vc;
		noofwheels=no;
		System.out.println("vehicle name:"+vehiclename+" cost:"+vehiclecost+" noofwheels:"+noofwheels);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo3 {


	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler("apache",25000,2);
		
		Fourwheeler car=new Fourwheeler("Santrocar",2500000,4);
		
		Heavyvehicle lorry=new Heavyvehicle("lorry",8000000,16);
		
		
		
		
	}

}
