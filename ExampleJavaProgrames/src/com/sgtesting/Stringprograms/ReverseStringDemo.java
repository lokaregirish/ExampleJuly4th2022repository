package com.sgtesting.Stringprograms;

public class ReverseStringDemo {

	public static void main(String[] args) {
		//using Substr
		String hh="program";
		int n=7;
		for(int i=hh.length()-1;i>=0;i--)
		{
			System.out.print(hh.substring(i,n));
			n--;
		}
		System.out.println();
		//using CharAt
		for(int j=hh.length()-1;j>=0;j--)
		{
			System.out.print(hh.charAt(j));
		}
		
		


	}

}
