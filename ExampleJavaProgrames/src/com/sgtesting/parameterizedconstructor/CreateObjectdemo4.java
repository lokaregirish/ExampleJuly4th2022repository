package com.sgtesting.parameterizedconstructor;
class Country
{
	String countryname;
	int population;
	int noofstates;
	
	Country(String cn,int po,int no)
	{
		countryname=cn;
		population=po;
		noofstates=no;
		System.out.println("country name:"+countryname+" population:"+population+" no of states:"+noofstates);
		System.out.println("++++++++++++++++++");	
	}
}

class State
{
	String statename;
	int population;
	int noofdistricts;
	
	State(String sn,int po,int no)
	{
		statename=sn;
		population=po;
	    noofdistricts=no;
		System.out.println("state name:"+statename+" population:"+population+" no of districts:"+noofdistricts);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Village
{
	String villagename;
	int population;
	int noofhouses;
	
	Village(String vi,int po,int no)
	{
		villagename=vi;
		population=po;
		noofhouses=no;
		System.out.println("village name:"+villagename+" population:"+population+" no of houses:"+noofhouses);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo4 {


	public static void main(String[] args) {
		Country india=new Country("India",1200000000,28);
		
		State karnataka=new State("Karnataka",64100000,31);
		
		Village kallur=new Village("Kallur",30000,15224);
		
		
		
		
	}

}
