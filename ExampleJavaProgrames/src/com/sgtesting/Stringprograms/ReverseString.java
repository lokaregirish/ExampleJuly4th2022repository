package com.sgtesting.Stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		Reverse();
		Reverse2();
		Reverse3();
	}
	private static void Reverse()
	{
		String s="chatat";
		char o[]=s.toCharArray();
		String rev=" ";
		for(int i=o.length-1;i>=0;i--)
		{
			rev=rev+o[i];
		}
		System.out.println(rev);
	}
	private static void Reverse2()
	{
		String s="tochararray";
		char o[]=s.toCharArray();
		String rev=" ";
		for(int i=o.length-1;i>=0;i--)
		{
			rev=rev+o[i];
		}
		System.out.println(rev);
	}
	private static void Reverse3()
	{
		String s="substring";
		char o[]=s.toCharArray();
		String rev=" ";
		for(int i=o.length-1;i>=0;i--)
		{
			rev=rev+o[i];
		}
		System.out.println(rev);
		StringBuffer hh=new StringBuffer("program");
	    String h=hh.substring(0,1);
		System.out.println(h);
		String q1=hh.substring(6,7);
		String q2=hh.substring(5,6);
		String q3=hh.substring(4,5);
		String q4=hh.substring(3,4);
		String q5=hh.substring(2,3);
		String q6=hh.substring(1,2);
		String q7=hh.substring(0,1);
		StringBuffer jj=new StringBuffer();
		jj.append(q1);
		jj.append(q2);
		jj.append(q3);
		jj.append(q4);
		jj.append(q5);
		jj.append(q6);
		jj.append(q7);
		System.out.println(jj);
		
				
		
		
		
		
	}
	
	


}
