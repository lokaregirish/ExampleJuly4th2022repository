package com.sgtesting.characaterstream;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		Writecontent();

	}
	private static void Writecontent()
	{
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter("E:\\WELCOME\\Demo\\test.txt",true);
			String s="how many contents are available in core java and what are they?";
			char b[]=s.toCharArray();
			fw.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			fw.flush();
			fw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
