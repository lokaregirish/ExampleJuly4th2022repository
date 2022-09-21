package com.sgtesting.inheritanceprograms;
interface Mathsaction
{
	int a=10;
	int b=15;
}
class Addition implements Mathsaction
{
	void Displayvariables()
	{	
		System.out.println(a);
		System.out.println(b);
	}
}

public class Executevariablesfrominterface {

	public static void main(String[] args) {
		Addition mn=new Addition();
		mn.Displayvariables();

	}

}
