package com.sgtesting.aftermethods;
//wrong program
class Number
{
	void palindrome(int num)
	{
		int x=num/10;
		int y=num%10;
		if(((x*10)+y)==num)
        {
	        System.out.println("Given number is a palindrome: "+num);
        }
	    else 
        {  
	        System.out.println("Given number is not a palindrome: "+num);
        }
		
	}
}

public class Palindrome {

	public static void main(String[] args) {
		Number bb=new Number();
		bb.palindrome(1234);

	}

}
