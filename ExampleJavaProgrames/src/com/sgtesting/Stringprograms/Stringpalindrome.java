package com.sgtesting.Stringprograms;

public class Stringpalindrome {

	public static void main(String[] args) {
		Palindrome();
		Approach2();

	}
	private static void Palindrome()
	{
		String s="malayalam";
	    char o[]=s.toCharArray();
	    String rev="";
	    for(int i=o.length-1;i>=0;i--)
	    {
	    	rev=rev+o[i];
	    }
	    System.out.println(rev);
	    if(s.equals(rev))
	    {
	    	System.out.println("Given String is a palindrom: "+s);
	    }
	    else
	    {
	    	System.out.println("Given String is not a palindrome: "+s);
	    }
		
		
	}
	private static void Approach2()
	{
		//failed approach
		String e="gadag";
		char g[]=e.toCharArray();
		char h[]=new char[g.length];
		int k=0;
		for(int i=g.length-1;i>=0;i--)
		{
			h[k]=g[i];
			k++;
		}
		String m=new String(h);
		System.out.println(m);
		if(e.equals(h))
		{
			System.out.println("the given String is palindrome: "+e);
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
				
		
		
	}
	
	

}
