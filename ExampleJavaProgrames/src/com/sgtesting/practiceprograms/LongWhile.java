package com.sgtesting.practiceprograms;

public class LongWhile {

	public static void main(String[] args) {
		long b[][]= {{23,35,46},{47,58,69}};
		int i=0;
		while(i<=b.length-1)
		{
			int j=0;
			while(j<=b[i].length-1)
			{
				
				 System.out.print(b[i][j]+" ");
				 j++;
			}
			
			System.out.println();
			i++;
		}
			
	}

}
