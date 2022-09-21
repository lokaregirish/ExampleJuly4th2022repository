package com.sgtesting.practiceprograms;

public class FirstColumnDowhile {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{3,4,5}};
		int i=0;
		do
		{
			int c=-1;
			do
			{
				c++;
				if(c>=1)
				{
					continue;
				}
				System.out.print(b[i][c]+" ");
				
				
			}while(c<b[i].length);
			System.out.println();
			i++;
		}while(i<b.length);

	}

}
