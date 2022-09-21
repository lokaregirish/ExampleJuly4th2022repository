package com.sgtesting.characaterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;

class File2
{
	void Writeline(String path)
	{
		FileWriter h=null;
		BufferedWriter b=null;
		try
		{
			h=new FileWriter(path);
			b=new BufferedWriter(h);
			b.write("this is Girish and i now bacame software engineer");
			b.newLine();
			b.write("and also now i am satisfied with my work");
			b.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			b.flush();
			b.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

public class BuffredWriterdemo3 {

	public static void main(String[] args) {
		File2 obj=new File2();
		obj.Writeline("E:\\WELCOME\\Demo\\giri.txt");
		

	}

}
