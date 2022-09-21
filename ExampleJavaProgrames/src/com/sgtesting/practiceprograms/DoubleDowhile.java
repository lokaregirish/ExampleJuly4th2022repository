package com.sgtesting.practiceprograms;

public class DoubleDowhile {

	public static void main(String[] args) {
		Double b[][]= {{23.4,34.5,45.6},{46.7,57.8,68.9}};
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
