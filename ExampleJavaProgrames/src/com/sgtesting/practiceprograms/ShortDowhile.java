package com.sgtesting.practiceprograms;

public class ShortDowhile {

	public static void main(String[] args) {
		short b[][]= {{2,3,4},{4,5,6}};
		int i=b.length-1;
		do
		{
			int j=b[i].length-1;
			do
			{
				
				 System.out.print(b[i][j]+" ");
				 j--;
			}while(j>=0);
			
			System.out.println();
			i--;
		}while(i>=0);
		
		

	}

}
