package com.sgtesting.practiceprograms;

public class FirstRowForloop {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{3,4,5}};
		for(int i=0;i<=b.length-1;i++)
		{
			for(int c=0;c<=b[i].length-1;c++)
			{
				if(i>=1)
				{
					continue;
				}
				System.out.print(b[i][c]+" ");
				
			}
			System.out.println();
		}

	}

}
