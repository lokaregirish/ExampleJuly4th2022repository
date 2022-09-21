package com.sgtesting.Stringprograms;

public class Banglore {

	public static void main(String[] args) {
		Disaply();
		
	}
	private static void Disaply()
	{
		String s="Banglore and Mysore";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}

	

}
