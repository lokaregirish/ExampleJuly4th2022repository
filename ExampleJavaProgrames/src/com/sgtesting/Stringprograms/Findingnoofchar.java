package com.sgtesting.Stringprograms;

public class Findingnoofchar {

	public static void main(String[] args) {
		Findingchar();
		Findingchar2();
		Findingchar3();

	}
	private static void Findingchar()
	{
		String s="chatat";
		char o[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=o.length-1;i++)
		{
			count=count+1;
		}
		System.out.println("The given charcater in array: "+count);
	}
	private static void Findingchar2()
	{
		String s="tochararray";
		char o[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=o.length-1;i++)
		{
			count=count+1;
		}
		System.out.println("The given charcater in array: "+count);
	}
	private static void Findingchar3()
	{
		String s="substring";
		char o[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=o.length-1;i++)
		{
			count=count+1;
		}
		System.out.println("The given charcater in array: "+count);
	}



}
