package com.sgtesting.fileprograms;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
	public static void main(String[] args) {
		Readcontent();
	}
	private static void Readcontent()
	{
		FileInputStream fnn=null;
		int h=0;
		try
		{
			fnn=new FileInputStream("E:\\WELCOME\\Demo\\Test2.txt");
			while(true)
			{
			    h=fnn.read();
			    if(h==-1)
			    {
			    	break;
			    }
				char ch=(char)h;
				System.out.print(ch);
			}			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fnn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

}
