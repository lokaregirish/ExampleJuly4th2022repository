package com.sgtesing.inheritanceprograms;
class AAA
{
	String name;
	void Displayname()
	{
		System.out.println("name in AAA: "+name);
	}
}
class BBB extends AAA
{
	String name;
	BBB(String name1,String name2)
	{
		super.name=name1;
		name=name2;
	}
	void Displayname2()
	{
		System.out.println("name in BBB: "+name);
	}
}
class CCC extends BBB
{
	String name;
	CCC(String name1,String name2,String name3)
	{
		super(name1, name2);
		name=name3;
	}
	void Displayname3()
	{
		System.out.println("name in CCC: "+name);
	}
}
public class Samevariableswithouthardcoding {

	public static void main(String[] args) {
		CCC obj=new CCC("Nmageshwar rao","nagarjun","nagachaitanya");
		obj.Displayname();
		obj.Displayname2();
		obj.Displayname3();

	}

}
