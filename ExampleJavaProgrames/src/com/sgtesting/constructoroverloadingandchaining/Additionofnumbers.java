package com.sgtesting.constructoroverloadingandchaining;

public class Additionofnumbers {

	public static void main(String[] args) {
		int x[]= {2,3,4,5,6};
		int y[]= {4,5,6,7,8};
		for(int i=0;i<=x.length-1;i++)
		{
			int kk=x[i]+y[i];
			System.out.println(kk);
		}
		int m=25;
		int n=45;
		if(m>20)
		{
		     int res=m+n;
		     System.out.println(res);
		}
		else
		{
			System.out.println("invalid no");
		}

	}

}
