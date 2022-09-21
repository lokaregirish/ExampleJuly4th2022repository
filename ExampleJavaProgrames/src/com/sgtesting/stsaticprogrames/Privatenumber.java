package com.sgtesting.stsaticprogrames;
class Bank
{
	private int atmpin;
	String name;
	void setatmpin(int atmpin)
	{
		this.atmpin=atmpin;
	}
	int getatmpin()
	{
		return atmpin;
	}
}

public class Privatenumber {

	public static void main(String[] args) {
		Bank mysore=new Bank();
		mysore.name="Mysore bank";
		System.out.println(mysore.name);
		mysore.setatmpin(1123);
		int privateno=mysore.getatmpin();
		System.out.println(privateno);
		
		

	}

}
