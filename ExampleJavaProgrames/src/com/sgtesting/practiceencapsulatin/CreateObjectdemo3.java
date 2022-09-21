package com.sgtesting.practiceencapsulatin;
class Twowheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
}

class Fourwheeler
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
}
 
class Heavyvehicle
{
	String vehiclename;
	int vehiclecost;
	int noofwheels;
}

public class CreateObjectdemo3 {


	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler();
		obj1.vehiclename="apache";
		obj1.vehiclecost=250000;
		obj1.noofwheels=2;
		System.out.println("vehicle name:"+obj1.vehiclename+" cost:"+obj1.vehiclecost+" noofwheels:"+obj1.noofwheels);
		System.out.println("++++++++++++++++++");
		Fourwheeler car=new Fourwheeler();
		car.vehiclename="Santro car";
		car.vehiclecost=2500000;
		car.noofwheels=4;
		System.out.println("vehicle name:"+car.vehiclename+" cost:"+car.vehiclecost+" noofwheels:"+car.noofwheels);
		System.out.println("++++++++++++++++++");
		Heavyvehicle lorry=new Heavyvehicle();
		lorry.vehiclename="lorry";
		lorry.vehiclecost=8000000;
		lorry.noofwheels=16;
		System.out.println("vehicle name:"+lorry.vehiclename+" cost:"+lorry.vehiclecost+" noofwheels:"+lorry.noofwheels);
		System.out.println("++++++++++++++++++");
		
		
		
	}

}
