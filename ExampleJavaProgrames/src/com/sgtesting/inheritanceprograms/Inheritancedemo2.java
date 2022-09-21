package com.sgtesting.inheritanceprograms;
interface Vegetable
{
	void vegetableName(String name);
}
interface Vegetable2
{
	void vegetable2Name(String name);
}
class Name implements Vegetable,Vegetable2
{
	public void vegetableName(String name)
	{
		System.out.println("name of vegetable1: "+name);
	}
	public void vegetable2Name(String name)
	{
		System.out.println("name of vegetable2: "+name);
	}
	void vegetble3()
	{
		String name="carrot";
		System.out.println("name of vegetable3: "+name);
	}
}

public class Inheritancedemo2 {

	public static void main(String[] args) {
		Name run=new Name();
		run.vegetable2Name("ladies finger");
		run.vegetableName("pumpkin");
		run.vegetble3();

	}

}
