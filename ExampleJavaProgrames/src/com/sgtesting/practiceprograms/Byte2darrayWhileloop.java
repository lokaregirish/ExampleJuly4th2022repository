package com.sgtesting.practiceprograms;

public class Byte2darrayWhileloop {

	public static void main(String[] args) {
		byte b[][]= {{2,3,4},{4,5,6}};
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
