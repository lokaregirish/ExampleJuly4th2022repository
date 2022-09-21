package com.sgtesting.characaterstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		Writecontent();

	}
	private static void Writecontent()
	{
		Writer fw=null;
		BufferedWriter bw=null;
		try
		{
			File f1=new File("E:\\WELCOME\\Demo\\test.txt");
			fw=new FileWriter(f1);
			bw=new BufferedWriter(fw);
			bw.write("hello i am fine");
			bw.newLine();
			bw.write("this is not a java class");
			//bw.newLine();
						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			bw.flush();
			bw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
