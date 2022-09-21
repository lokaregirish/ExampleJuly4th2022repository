package com.sgtesting.practiceprograms;

public class CharacterForloop {

	public static void main(String[] args) {
		Character ch[][]= {{'a','s','d'},{'f','g','h'}};
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int c=ch[i].length-1;c>=0;c--)
			{
				System.out.print(ch[i][c]+" ");
			}
			System.out.println();
		}

	}

}
