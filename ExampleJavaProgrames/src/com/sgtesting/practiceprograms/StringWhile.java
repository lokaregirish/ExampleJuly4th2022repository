package com.sgtesting.practiceprograms;

public class StringWhile {

	public static void main(String[] args) {
		String s[][]= {{"apple","goat","daddy"},{"hat","king","queen"}};
		int i=s.length-1;
		while(i>=0)
		{
			int j=s[i].length-1;
			while(j>=0)
			{
				
				 System.out.print(s[i][j]+" ");
				 j--;
			}
			
			System.out.println();
			i--;
		}
		
		

	}

}
