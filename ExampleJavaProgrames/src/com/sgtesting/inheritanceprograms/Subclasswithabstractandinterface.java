package com.sgtesting.inheritanceprograms;
interface Parent1
{
	void showparentname(String name);
}
interface Parent2
{
	void showparentname2(String name);
}
abstract class Parent3
{
	abstract void showparentname3(String name);
	void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("sum of variables: "+sum);
	}
}
class ChildA extends Parent3 implements Parent1,Parent2
{
	public void showparentname(String name)
	{
		System.out.println("name of parenrt 1: "+name);
	}
	public void showparentname2(String name)
	{
		System.out.println("name of parent 2: "+name);
	}
	void showparentname3(String name)
	{
		System.out.println("name of parent3: "+name);
	}
}

public class Subclasswithabstractandinterface {

	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.addition(10, 15);
		obj.showparentname("fahad");
		obj.showparentname2("john");
		obj.showparentname3("liyakath");

	}

}
