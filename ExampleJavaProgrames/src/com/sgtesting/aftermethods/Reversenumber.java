package com.sgtesting.aftermethods;
class Reverse
{
	int Number(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		return reverse;
	}
}

public class Reversenumber {

	public static void main(String[] args) {
		Reverse rr=new Reverse();
		int m=rr.Number(98765);
		System.out.println(m);
		

	}

}
