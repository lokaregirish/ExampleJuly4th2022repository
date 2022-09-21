package com.sgtesting.practiceprograms;

public class CharacerDowhile {

	public static void main(String[] args) {
		char ch[][]= {{'w','h','u'},{'y','e','u'}};
		int i=ch.length-1;
		do
		{
			int j=ch[i].length-1;
			do
			{
				
				 System.out.print(ch[i][j]+" ");
				 j--;
			}while(j>=0);
			
			System.out.println();
			i--;
		}while(i>=0);
		
		

	}

}
