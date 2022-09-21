package com.sgtesting.iodemo;

import java.io.FileOutputStream;

class File2
{
	static void Writecontent()
	{
		FileOutputStream fo=null;
		try
		{
			fo=new FileOutputStream("E:\\WELCOME\\Demo\\giri.txt");
			String sentence="i am from civil engineering background";
			sentence+="also i completed my BE in A mbedkar institute of technology";
			byte b[]=sentence.getBytes();
			fo.write(b);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		try 
		{
		     fo.close();	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

public class FileOutputstreamDemo1 {

	public static void main(String[] args) {
		File2.Writecontent();
		

	}

}
