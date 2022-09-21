package com.sgtesting.characaterstream;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriter {

	public static void main(String[] args) {
		Writecontent();

	}
	private static void Writecontent()
	{
		Writer fw=null;
		BufferedWriter bw=null;
		try
		{
			File f1=new File("E:\\WELCOME\\Demo\\test6.txt");
			fw=new FileWriter(f1);
			String g="hello this is my world";
			g+="i am the king of my own world";
			char ch[]=g.toCharArray();
			fw.write(ch);
						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			fw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
