package com.sgtesting.practiceprograms;

public class Byte2darrayForloop {

	public static void main(String[] args) {
		byte b[][]= {{2,3,4},{4,5,6}};
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
