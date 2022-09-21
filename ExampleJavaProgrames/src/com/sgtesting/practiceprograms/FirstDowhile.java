package com.sgtesting.practiceprograms;

public class FirstDowhile {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{3,4,5}};
		int i=0;
		do
		{
			int c=-1;
			do
			{				
				if(i>=1)
				{
					continue;
				}
				System.out.print(b[i][c]+" ");
				c++;
				
			}while(c<b[i].length);
			System.out.println();
			i++;
		}while(i<b.length);

	}

}
