package com.sgtesting.inheritanceprograms;
interface University
{
	void showUniversityname(String name);
}
class College implements University
{
	public void showUniversityname(String name)
	{
		System.out.println("name of university: "+name);
	}
	void showaddress(String address)
	{
		System.out.println("address of college: "+address);
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		College obj=new College();
		obj.showaddress("12th main vijayanagara");
		obj.showUniversityname("Ambedkar college");

	}

}
