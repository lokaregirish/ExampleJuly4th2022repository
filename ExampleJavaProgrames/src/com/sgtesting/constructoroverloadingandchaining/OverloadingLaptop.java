package com.sgtesting.constructoroverloadingandchaining;
class Laptop
{
	Laptop(String ownername,int rupees)
	{
		System.out.println("Owner name: "+ownername+" rupees:"+rupees);
	}
	Laptop(String Dealername)
	{
		System.out.println("Dealer name: "+Dealername);
	}
	Laptop(int model)
	{
		System.out.println(" room no:"+model);
	}


	
}

public class OverloadingLaptop {

	public static void main(String[] args) {
		Laptop o1=new Laptop("jani",560000);
		Laptop o2=new Laptop("Sangeetha");
		Laptop o3=new Laptop(2022);

	}

}
