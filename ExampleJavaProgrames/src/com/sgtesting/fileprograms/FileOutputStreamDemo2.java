package com.sgtesting.fileprograms;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {

	public static void main(String[] args) {
		Writecontent();

	}
	private static void Writecontent()
	{
		FileOutputStream fos=null;
		try
		{
			fos=new FileOutputStream("E:\\WELCOME\\Demo\\test.txt");
			String j="jhgukehhddhddheh";
			byte b[]=j.getBytes();
						
			fos.write(b);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fos.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
