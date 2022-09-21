package com.sgtesting.practiceprograms;

public class Byte2darrayDowhile {

	public static void main(String[] args) {
		byte b[][]= {{2,3,4},{4,5,6}}; 
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
