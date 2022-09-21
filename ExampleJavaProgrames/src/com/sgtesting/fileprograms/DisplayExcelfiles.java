package com.sgtesting.fileprograms;

import java.io.File;

public class DisplayExcelfiles {

	public static void main(String[] args) {
		//TextFiles();
		//ExcelFilesFiles();
		ImageFiles();
		

	}
	private static void TextFiles()
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample");
		File f2[]=f1.listFiles();
		String s[]=new String[f2.length];
		for(int i=0;i<=f2.length-1;i++)
		{			
				String name=f2[i].getName();
				if(name.contains("txt"))
				{
					System.out.println(name);
				}
		}
		
	}
	private static void ExcelFilesFiles()
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample");
		File f2[]=f1.listFiles();
		String s[]=new String[f2.length];
		for(int i=0;i<=f2.length-1;i++)
		{			
				String name=f2[i].getName();
				if(name.contains("xlsx"))
				{
					System.out.println(name);
				}
		}
	
	}
	private static void ImageFiles()
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample");
		File f2[]=f1.listFiles();
		String s[]=new String[f2.length];
		for(int i=0;i<=f2.length-1;i++)
		{			
				String name=f2[i].getName();
				if(name.contains("JPG"))
				{
					System.out.println(name);
				}
		}
	
		}


		
	

	}


