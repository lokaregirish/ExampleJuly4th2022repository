package com.sgtesting.fileprograms;

import java.io.FileInputStream;

public class FileInputStreamDemo3 {

	public static void main(String[] args) {
		Readcontent2();

	}
	private static void Readcontent2()
	{
		FileInputStream fn=null;
		int n=0;
		try 
		{
			fn=new FileInputStream("E:\\WELCOME\\Demo\\Test.txt");
			
			while(true)
			{
				if(n==-1)
				{
					break;
				}
				n=fn.read();
				char ch=(char)n;
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
				fn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
