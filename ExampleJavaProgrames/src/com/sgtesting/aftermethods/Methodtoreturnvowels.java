package com.sgtesting.aftermethods;
class Vowels
{
	boolean vowels(char ch)
	{
		 boolean d=false;
	     switch(ch)
	     {
	     case 'a':case 'e':case 'i':case 'o':case 'u':
	    	 d=true;
	    	 break;
	    	 
	     }
	     return d;
	}
	String VOWEL(char b)
	{
		String s="not a vowel";
		if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u'))
		{
			s="it is a vowel";
		}
		return s;
	}
}

public class Methodtoreturnvowels {

	public static void main(String[] args) {
		Vowels vv=new Vowels();
		boolean s=vv.vowels('u');
		if (s==true)
		{
			System.out.println("it is a vowel");
		}
		else
		{
		    System.out.println("it is not a vowel");	
		}

		String h=vv.VOWEL('n');
		System.out.println(h);
	}

}
