package com.sgtesting.Stringprograms;

public class PatternDemo {

	public static void main(String[] args) {
		Pattern1();
		

	}
	private  static void Pattern1()
	{
		String s="program";
		char o[]=s.toCharArray();
		for(int i=1;i<=7;i++)
		{
			int k=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(o[k]+" ");
				k++;
			}
			System.out.println();
		}

	}
	


}
