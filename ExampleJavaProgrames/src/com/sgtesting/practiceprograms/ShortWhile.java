package com.sgtesting.practiceprograms;

public class ShortWhile {

	public static void main(String[] args) {
		short b[][]= {{2,3,4},{4,5,6}};
		int i=b.length-1;
		while(i>=0)
		{
			int j=b[i].length-1;
			while(j>=0)
			{
				
				 System.out.print(b[i][j]+" ");
				 j--;
			}
			
			System.out.println();
			i--;
		}
		
		

	}

}
