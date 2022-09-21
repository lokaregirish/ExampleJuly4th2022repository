package com.sgtesting.methodswhichreturnvalue;
class Array
{
	void Dulicate(int a[],int num)
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==num)
			{
				count=count+1;
				System.out.println("duplicate found");
				break;
			}
		}
		if(count==0)
		{
			System.out.println("duplicate not found");
		}
		
	}
}

public class Findoutduplicateno {

	public static void main(String[] args) {
		Array rr=new Array();
		int n[]= {1,2,3,4,5};
		rr.Dulicate(n, 5);
				

	}

}
