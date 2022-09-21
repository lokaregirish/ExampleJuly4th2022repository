package com.sgtesting.practiceprograms;

public class LastRowWhile {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{3,4,5}};
		int i=0;
		while(i<b.length)
		{
			int c=-1;
			while(c<b[i].length)
			{
				c++;
				if(i<=b.length-2)
				{
					continue;
				}
				System.out.print(b[i][c]+" ");
				
				
			}
			System.out.println();
			i++;
		}

	}

}
