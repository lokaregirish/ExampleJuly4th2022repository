package com.sgtesting.practiceprograms;

public class DoubleWhile {

	public static void main(String[] args) {
		double b[][]= {{22.2,22.3,22.4},{33.4,33.5,33.6}};
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
