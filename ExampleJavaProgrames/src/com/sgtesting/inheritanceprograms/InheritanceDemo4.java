package com.sgtesting.inheritanceprograms;
interface Sports
{
	void cricket(String sname);
}
class Cricket implements Sports
{
	public void cricket(String sname)
	{
		System.out.println("name of sports: "+sname);
	}
	void Cricketassets(String any1)
	{
		System.out.println("name of asset: "+any1);
	}
}
public class InheritanceDemo4 {

	public static void main(String[] args) {
		Sports obj=new Cricket();
		obj.cricket("Cricket");
	    // obj.Cricketassets("bat"); we cannot access this
		

	}

}
