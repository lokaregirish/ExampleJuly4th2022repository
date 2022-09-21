package com.sgtesting.methodswhichreturnvalue;
class Addition
{
	int [][] Matrix(int a[][],int b[][])
	{
		int m[][]=new int[a.length][a[0].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				m[i][j]=a[i][j]+b[i][j];
			}
		}
		return m;
	}
}

public class Additionofmatrix {

	public static void main(String[] args) {
		Addition jj=new Addition();
		int c[][]= {{2,3,4},{3,4,5}};
		int d[][]= {{4,5,6},{6,7,8}};
		int h[][]=jj.Matrix(c,d);
		for(int i=0;i<=h.length-1;i++)
		{
			for(int j=0;j<=h[i].length-1;j++)
			{
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}

	}

}
