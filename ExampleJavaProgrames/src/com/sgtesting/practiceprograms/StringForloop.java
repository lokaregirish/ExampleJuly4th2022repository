package com.sgtesting.practiceprograms;

public class StringForloop {

	public static void main(String[] args) {
		String s[][]= {{"apple","goat","daddy"},{"hat","king","queen"}};
		for(int i=s.length-1;i>=0;i--)
		{
			for(int c=s[i].length-1;c>=0;c--)
			{
				System.out.print(s[i][c]+" ");
			}
			System.out.println();
		}

	}

}
