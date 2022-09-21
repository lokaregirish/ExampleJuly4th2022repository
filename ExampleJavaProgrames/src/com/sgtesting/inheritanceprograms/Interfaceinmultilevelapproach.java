package com.sgtesting.inheritanceprograms;
interface Student1
{
	void Displayname(String name);
}
interface Student2 extends Student1
{
	void Displayname2(String name);
}
interface Student3 extends Student2
{
	void Displyname3(String name);
}
class Display implements Student3
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

}

public class Interfaceinmultilevelapproach {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.Displayname("giri");
		obj.Displayname2("hari");
		obj.Displyname3("mahi");

	}

}
