package com.sgtesting.methodswhichreturnvalue;
class Divisible
{
	int Division()
	{
		int count = 0;
		for(int i=50;i<=100;i++)
		{
			if(i%6==0)
			{
				 count=count+1;
			}
		}
		return count;

	}
}

public class Divisibleby6 {

	public static void main(String[] args) {
		Divisible aa=new Divisible();
		int h=aa.Division();
		System.out.println(h);
	

	}

}
