package com.sgtesting.practiceencapsulatin;
class Country
{
	String countryname;
	int population;
	int noofstates;
}

class State
{
	String statename;
	int population;
	int noofdistricts;
}
 
class Village
{
	String villagename;
	int population;
	int noofhouses;
}

public class CreateObjectdemo4 {


	public static void main(String[] args) {
		Country india=new Country();
		india.countryname="India";
		india.population=1200000000;
		india.noofstates=28;
		System.out.println("country name:"+india.countryname+" population:"+india.population+" no of states:"+india.noofstates);
		System.out.println("++++++++++++++++++");
		State karnataka=new State();
		karnataka.statename="Karnataka";
		karnataka.population=64100000;
		karnataka.noofdistricts=31;
		System.out.println("state name:"+karnataka.statename+" population:"+karnataka.population+" no of districts:"+karnataka.noofdistricts);
		System.out.println("++++++++++++++++++");
		Village kallur=new Village();
		kallur.villagename="Kallur";
		kallur.population=30000;
		kallur.noofhouses=15224;
		System.out.println("village name:"+kallur.villagename+" population:"+kallur.population+" no of houses:"+kallur.noofhouses);
		System.out.println("++++++++++++++++++");
		
		
		
	}

}
