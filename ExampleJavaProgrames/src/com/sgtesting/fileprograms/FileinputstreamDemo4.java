package com.sgtesting.fileprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileinputstreamDemo4 {

	public static void main(String[] args) {
		//Readcontent();
		Writeintofile();

	}
	private static void Readcontent()
	{
		FileInputStream fi=null;
		int n=0;
		try
		{
			fi=new FileInputStream("E:\\WELCOME\\CityName.java");
			while(true)
			{	
				if(n==-1)
				{
					break;
				}
				n=fi.read();
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
				fi.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	private static void Writeintofile()
	{
		FileOutputStream fo=null;
		try
		{
			fo=new FileOutputStream("E:\\WELCOME\\Giri.txt",true);
			String h="i completed my BE in ambedkar institute of technology";
			h+="my native is Raichur";
			byte b[]=h.getBytes();
			fo.write(b);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fo.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	}

}
