package com.sgtesting.practiceprograms;

public class LongDowhile {

	public static void main(String[] args) {
		long b[][]= {{22,334,44},{54,55,56}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				
				 System.out.print(b[i][j]+" ");
				 j++;
			}while(j<=b[i].length-1);
			
			System.out.println();
			i++;
		}while(i<=b.length-1);
		
		

	}

}
