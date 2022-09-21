package com.sgtesting.constructoroverloadingandchaining;
class Animals
{
	Animals(String animalname,int animalid)
	{
		this(15);
		System.out.println("animal name: "+animalname+"  animal id: "+animalid);
	}
	Animals(String zooname)
	{
		
		System.out.println("animal available in zoo: "+zooname);
		
	}
	Animals(int noofanimals)	
	{
	
		this("ranganathittu");
		System.out.println("no of animals available: "+noofanimals);
		
	}
}

public class ChainingConstructorAnimals {

	public static void main(String[] args) {
		Animals S=new Animals("monkey",25);
		

	}

}
