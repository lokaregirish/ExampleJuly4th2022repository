package com.sgtesting.inheritanceprograms;
interface StudentA
{
	void Displayname(String name);
}
interface StudentB extends StudentA
{
	void Displayname2(String name);
}
interface StudentC extends StudentA
{
	void Displyname3(String name);
}
class DisplayABC implements StudentA
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

public class Hirarchialapproah {

	public static void main(String[] args) {
		DisplayABC obj=new DisplayABC();
		obj.Displayname("giri");
		obj.Displayname2("hari");
		obj.Displyname3("mahi");

	}

}
