package com.sgtesting.fileprograms;

import java.io.File;

public class DisplayFiles {

	public static void main(String[] args) {
		//Display();
		DisplayFolder();
		//Displaytxtfiles();

	}
	private static void Display() 
	{
		
		
			File f1=new File("E:\\WELCOME\\Demo\\Sample9\\hari.txt");
			boolean j=f1.canExecute();
			System.out.println(j);
			
			boolean u=f1.canRead();
			System.out.println(u);
			
			boolean o=f1.canWrite();
			System.out.println(o);
			
		    
		   
		/*File f2[]=f1.listFiles();
		for(int i=0;i<=f2.length-1;i++)
		{
			String path=f2[i].getPath();
			System.out.println(path);
		}*/
		
	}
	private static void DisplayFolder() 
	{
		File f1=new File("E:\\WELCOME\\Demo\\java123");
		File f2[]=f1.listFiles();
		for(int i=0;i<=f2.length-1;i++)
		{
			if(f2[i].isDirectory())
			{
				String path=f2[i].getAbsolutePath();
				System.out.println(path);
			}
		}
		
	}
	private static void Displaytxtfiles() 
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample");
		File f2[]=f1.listFiles();
		for(int i=0;i<=f2.length-1;i++)
		{
			if(f2[i].isFile())
			{
				String path=f2[i].getAbsolutePath();
				System.out.println(path);
			}
		}
		
	}
	


}
