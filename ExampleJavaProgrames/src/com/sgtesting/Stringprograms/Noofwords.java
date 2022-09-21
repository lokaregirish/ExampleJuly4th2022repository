package com.sgtesting.Stringprograms;

public class Noofwords {

	public static void main(String[] args) {
		Words();

	}
	private static void Words()
	{
		String s="the temple is at the top of the hill";
		String s1[]=s.split(" ");
		int count=0;
		for(int i=0;i<=s1.length-1;i++)
		{
			count=count+1;
		}
		System.out.println("no of words in a given String is: "+count);
	}

}
