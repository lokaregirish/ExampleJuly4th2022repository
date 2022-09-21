package com.sgtesting.aftermethods;
class Array2
{
	String [] array(String s[]) 
	{
		return s;
	}
}

public class Stringreturn {

	public static void main(String[] args) {
		String d[]= {"ant","eagle","doll","goat"};
		Array2 ff=new Array2();
	    String h[]=ff.array(d);
	    for(String u:h)
	    {
	    	System.out.println(u);
	    }
		

	}

}
