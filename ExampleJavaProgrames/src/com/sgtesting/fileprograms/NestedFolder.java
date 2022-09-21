package com.sgtesting.fileprograms;

import java.io.File;

public class NestedFolder {

	public static void main(String[] args) {
		NestedFolders();

	}
	private static void NestedFolders()
	{
		String s[]= {"v1\\","v2\\","v3\\","v4\\","v5\\"};
		String sum="E:\\WELCOME\\Demo\\";
		for(int i=0;i<=s.length-1;i++)
		{
			sum=sum+s[i];
			File f2=new File(sum);
			f2.mkdir();
		}
		
	}

}
