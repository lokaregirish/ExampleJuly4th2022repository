package com.sgtesting.inheritanceprograms;
interface StudA
{
	void Displayname(String name);
}
interface StudB extends StudA
{
	void Displayname2(String name);
}
interface StudC extends StudA
{
	void Displyname3(String name);
}
interface StudD extends StudA
{
	void Displayname4(String name);
}
class DisplayA implements StudA
{
	public void Displayname(String name)
	{
		System.out.println("name of student1: "+name);
	}
	public void Displayname2(String name)
	{
		System.out.println("name of student2: "+name);
	}
	public void Displyname3(String name)
	{
		System.out.println("name of student3: "+name);
	}
	public void Displayname4(String name)
	{
		System.out.println("name of student3: "+name);
	}
}

public class Hybridlevelinterface {

	public static void main(String[] args) {
		DisplayA obj=new DisplayA();
		obj.Displayname("giri");
		obj.Displayname2("hari");
		obj.Displyname3("mahi");
		obj.Displayname4("kiran");

	}

}
