package com.sgtesting.inheritanceprograms;
interface VegetableA
{
	void vegetableName(String name);
}
interface VegetableB extends VegetableA
{
	void vegetable2Name(String name);
}
class NameA implements VegetableB
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

public class Inheritancedemo3 {

	public static void main(String[] args) {
		NameA run=new NameA();
		run.vegetable2Name("ladies finger");
		run.vegetableName("pumpkin");
		run.vegetble3();

	}

}
