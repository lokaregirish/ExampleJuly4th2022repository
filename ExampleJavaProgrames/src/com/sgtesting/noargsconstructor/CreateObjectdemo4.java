package com.sgtesting.noargsconstructor;
class Country
{
	String countryname;
	int population;
	int noofstates;
	
	Country()
	{
		countryname="India";
		population=1200000000;
		noofstates=28;
		System.out.println("country name:"+countryname+" population:"+population+" no of states:"+noofstates);
		System.out.println("++++++++++++++++++");	
	}
}

class State
{
	String statename;
	int population;
	int noofdistricts;
	
	State()
	{
		statename="Karnataka";
		population=64100000;
	    noofdistricts=31;
		System.out.println("state name:"+statename+" population:"+population+" no of districts:"+noofdistricts);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Village
{
	String villagename;
	int population;
	int noofhouses;
	
	Village()
	{
		villagename="Kallur";
		population=30000;
		noofhouses=15224;
		System.out.println("village name:"+villagename+" population:"+population+" no of houses:"+noofhouses);
		System.out.println("++++++++++++++++++");	
	}
}

public class CreateObjectdemo4 {


	public static void main(String[] args) {
		Country india=new Country();
		
		State karnataka=new State();
		
		Village kallur=new Village();
		
		
		
		
	}

}
