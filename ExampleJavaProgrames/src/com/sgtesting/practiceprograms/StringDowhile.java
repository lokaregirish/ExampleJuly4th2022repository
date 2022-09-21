package com.sgtesting.practiceprograms;

public class StringDowhile {

	public static void main(String[] args) {
		String s[][]= {{"apple","goat","daddy"},{"hat","king","queen"}};
		int i=s.length-1;
		do
		{
			int j=s[i].length-1;
			do
			{
				
				 System.out.print(s[i][j]+" ");
				 j--;
			}while(j>=0);
			
			System.out.println();
			i--;
		}while(i>=0);
		
		

	}

}
