package com.sgtesting.practiceprograms;

public class CharacterWhile {

	public static void main(String[] args) {
		Character ch[][]= {{'a','d','g'},{'h','k','o'}};
		int i=ch.length-1;
		while(i>=0)
		{
			int j=ch[i].length-1;
			while(j>=0)
			{
				
				 System.out.print(ch[i][j]+" ");
				 j--;
			}
			
			System.out.println();
			i--;
		}
		
		

	}

}
