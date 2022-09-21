package com.sgtesting.fileprograms;

import java.io.File;

public class CreateSubfolders {

	public static void main(String[] args) {
		//Createfiles();
		//Creatfolders();
		Createfolders2();
		//Nestedfolders3();
		

	}
	private static void Createfiles()
	{
	    try
	    {
		      File f1=new File("E:\\WELCOME\\Demo\\Sample\\test.txt");
		      f1.createNewFile();
	    }catch(Exception e)
	    {
	        	e.printStackTrace();
	    }

     }
	private static void Creatfolders() 
	{
		try
	    {
		      File f1=new File("E:\\WELCOME\\Demo\\Sample2");
		      f1.mkdir();
	    }catch(Exception e)
	    {
	        	e.printStackTrace();
	    }
		
	}
	private static void Createfolders2() 
	{
		try
	    {
			int k=0;
			for(int i=0;i<=9;i++)
			{
				 File f1=new File("E:\\WELCOME\\Demo\\Sample\\test"+k);
				 f1.mkdir();
				 k++;
			}
					     
	    }catch(Exception e)
	    {
	        	e.printStackTrace();
	    }
		
	}
	private static void Nestedfolders3() 
	{
		try
	    {
			for(int i=0;i<=0;i++)
			{
				 
				 File f1=new File("E:\\WELCOME\\Demo\\Sample\\Sample"+i);
				 f1.mkdir();
				 for(int j=0;j<=0;j++)
				 {
					 File f2=new File("E:\\WELCOME\\Demo\\Sample\\Sample"+i+"\\Sample"+(i+1));
					 f2.mkdir();
					 for(int k=0;k<=0;k++)
					 {
						 File f3=new File("E:\\WELCOME\\Demo\\Sample\\Sample"+i+"\\Sample"+(i+1)+"\\Sample"+(i+2));
						 f3.mkdir();
						 for(int p=0;p<=0;p++)
						 {
							 File f4=new File("E:\\WELCOME\\Demo\\Sample\\Sample"+i+"\\Sample"+(i+1)+"\\Sample"+(i+2)+"\\Sample"+(i+3));
							 f4.mkdir();
						 }
					 }
				 }
				 
			}
					     
	    }catch(Exception e)
	    {
	        	e.printStackTrace();
	    }
		
	}
	
}
	

