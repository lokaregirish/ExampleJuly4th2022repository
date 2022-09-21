package com.sgtesting.practiceprograms;

public class LongForloop {

	public static void main(String[] args) {
		long b[][]= {{23,345,45},{45,56,67}};
		for(int i=0;i<=b.length-1;i++)
		{
			for(int c=0;c<=b[i].length-1;c++)
			{
				System.out.print(b[i][c]+" ");
			}
			System.out.println();
		}

	}

}
