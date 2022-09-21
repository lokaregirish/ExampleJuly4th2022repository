package com.sgtesting.methodswhichreturnvalue;
class Return
{
	int[] Firsthalf(int k[])
	{		
		int c[]=new int[k.length/2];
		for(int i=0;i<k.length/2;i++)
		{
			c[i]=k[i];
		}
		return c;
	}
}

public class Return1sthalfofelements {

	public static void main(String[] args) {
		Return hh=new Return();
		int j[]= {2,3,4,5,6,7};
		int y[]=hh.Firsthalf(j);
		for(int i=0;i<=y.length-1;i++)
		{
			System.out.println(y[i]);
		}

	}

}
