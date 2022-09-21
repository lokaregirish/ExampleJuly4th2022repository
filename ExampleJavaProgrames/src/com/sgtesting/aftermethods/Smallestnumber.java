package com.sgtesting.aftermethods;
class Smallest
{
	int small(int a,int b,int c)
	{
		int d = 0;
		if((a>b)&&(a>c))
		{
			d=a;
		}
		else if((b>a)&&(b>c))
		{
			d=b;
		}
		else if((c>a)&&(c>b))
		{
			d=c;
		}
		return d;

		
	}
	
}

public class Smallestnumber {

	public static void main(String[] args) {
		Smallest sm=new Smallest();
		int y=sm.small(23, 45, 67);
	

	}

}
