package com.sgtesting.fileprograms;

import java.io.File;

public class Weekday {

	public static void main(String[] args) {
		Week();
		

	}
	private static void Week()
	{
		String s[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturady"};
		try
		{
		for(int i=0;i<=s.length-1;i++)
		{
			File f1=new File("E:\\WELCOME\\Demo\\Sample0\\"+s[i]);
			f1.mkdir();
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
