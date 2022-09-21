package com.sgtesting.characaterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		Readlinebyline();

	}
	private static void Readlinebyline()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("E:\\WELCOME\\Demo\\test.txt");
			br=new BufferedReader(fr);
			String Line=null;
			
			while((Line=br.readLine())!=null)
			{
				System.out.println(Line);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
		     br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
