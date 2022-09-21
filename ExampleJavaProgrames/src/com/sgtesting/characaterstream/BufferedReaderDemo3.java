package com.sgtesting.characaterstream;

import java.io.BufferedReader;
import java.io.FileReader;

class File
{
	static void ReadLine()
	{
		FileReader p=null;
		BufferedReader b=null;
		try
		{
		      p=new FileReader("E:\\WELCOME\\Demo\\giri.txt");
		      b=new BufferedReader(p);
		      String line=null;
		      while((line=b.readLine())!=null)
		      {
		    	  System.out.println(line);
		      }
		    	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			b.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

public class BufferedReaderDemo3 {

	public static void main(String[] args) {
		File.ReadLine();

	}

}
