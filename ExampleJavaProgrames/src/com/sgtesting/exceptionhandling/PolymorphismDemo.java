package com.sgtesting.exceptionhandling;
interface Geometry
{
	void area();
}
class Square implements Geometry
{
	public void area()
	{
		int side=5;
		System.out.println(side*side);
	}
}
class Rectangle implements Geometry
{
	public void area()
	{
		int length=5;
		int breadth=8;
		System.out.println(length*breadth);
	}
}
class Circle implements Geometry
{
	public void area()
	{
		double pi=3.14;
		double r=4.5;
		System.out.println(pi*r*r);
	}

}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Geometry Referencevariable=null;
		//Referencevariable=new Square();
		//Referencevariable.area();
		//Referencevariable=new Rectangle();
		//Referencevariable.area();
		//Referencevariable=new Circle();
		//Referencevariable.area();
		Square sq=new Square();
		Rectangle re=new Rectangle();
		Circle ci=new Circle();
		Referencevariable=sq;
		Referencevariable.area();
		Referencevariable=re;
		Referencevariable.area();
		Referencevariable=ci;
		Referencevariable.area();
		
		
		
	}

}
