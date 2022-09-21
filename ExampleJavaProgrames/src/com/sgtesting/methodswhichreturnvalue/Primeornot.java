package com.sgtesting.methodswhichreturnvalue;
class Prime
{
	int Primenumber(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
				break;
			}
		}
		return count;
	}
}

public class Primeornot {

	public static void main(String[] args) {
		Prime jj=new Prime();
		int yy=jj.Primenumber(7);
		if(yy==0)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		

	}

}
