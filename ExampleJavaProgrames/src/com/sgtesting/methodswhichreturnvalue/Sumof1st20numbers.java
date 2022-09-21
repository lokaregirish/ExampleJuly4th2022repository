package com.sgtesting.methodswhichreturnvalue;
class Sumofnumbers
{
	int Sum()
	{
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class Sumof1st20numbers {

	public static void main(String[] args) {
	     Sumofnumbers ss=new Sumofnumbers();
	     int k=ss.Sum();
	     System.out.println(k);

	}

}
