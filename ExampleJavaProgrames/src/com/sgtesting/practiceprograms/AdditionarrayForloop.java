package com.sgtesting.practiceprograms;

public class AdditionarrayForloop {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{4,5,6}};
		int b[][]= {{4,6,4},{2,4,6}};
		int m=0;
		int c[][]=new int[a.length][a[m].length];
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
