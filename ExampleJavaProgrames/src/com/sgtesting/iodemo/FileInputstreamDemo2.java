package com.sgtesting.iodemo;

import java.io.FileInputStream;

class File
{
	static void Readcontent()
	{
		FileInputStream fm=null;
		try
		{
			fm=new FileInputStream("E:\\WELCOME\\Demo\\giri.txt");
			int n=0;
			while(true)
			{
				n=fm.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			fm.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class FileInputstreamDemo2 {

	public static void main(String[] args) {
		File.Readcontent();
	

	}

}
