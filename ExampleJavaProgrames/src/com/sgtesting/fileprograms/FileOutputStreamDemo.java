package com.sgtesting.fileprograms;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("E:\\WELCOME\\Demo\\Test2.txt",true);
			
			String str="Java is a Programming language,";
			str+="Java is used for developing applications.";
			
			byte b[]=str.getBytes();
			
			fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
