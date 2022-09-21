package com.sgtesting.methodswhichreturnvalue;
class Evennumbers
{
	int Sumeven()
	{
		int sum=0;
		for(int i=250;i<=350;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}

public class Sumofevennumbers {

	public static void main(String[] args) {
		Evennumbers kk=new Evennumbers();
		int y=kk.Sumeven();
		System.out.println(y);

	}

}
