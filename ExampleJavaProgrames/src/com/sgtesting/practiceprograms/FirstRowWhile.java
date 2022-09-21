package com.sgtesting.practiceprograms;

public class FirstRowWhile {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{3,4,5}};
		int i=0;
		while(i<b.length)
		{
			int c=0;
			while(c<b[i].length)
			{
				if(i>=1)
				{
					continue;
				}
				System.out.print(b[i][c]+" ");
				c++;
				
			}
			System.out.println();
			i++;
		}

	}

}
