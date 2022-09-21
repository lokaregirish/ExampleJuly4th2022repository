package com.sgtesting.practiceprograms;

public class DoubleForloop {

	public static void main(String[] args) {
		double b[][]= {{22.3,44.3,55.4},{45.4,66.5,77.6}};
		for(int i=b.length-1;i>=0;i--)
		{
			for(int c=b[i].length-1;c>=0;c--)
			{
				System.out.print(b[i][c]+" ");
			}
			System.out.println();
		}

	}

}
