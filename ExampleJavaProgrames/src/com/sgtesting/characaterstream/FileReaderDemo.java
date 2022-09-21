package com.sgtesting.characaterstream;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		readcontentbycharcater();

	}
	private static void readcontentbycharcater()
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("E:\\WELCOME\\Demo\\test.txt");
		    int n=0;
			while(true)
			{
				n=fr.read();
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
			fr.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
