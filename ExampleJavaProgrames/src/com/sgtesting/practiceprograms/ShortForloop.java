package com.sgtesting.practiceprograms;

public class ShortForloop {

	public static void main(String[] args) {
		Short b[][]= {{2,3,4},{4,5,6}};
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
