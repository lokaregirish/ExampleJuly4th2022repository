package com.sgtesting.fileprograms;

import java.io.File;

public class SearchFolderofHanuman {

	public static void main(String[] args) {
		Hanuman();
		

	}
	private static void Hanuman() 
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample");
		File f2[]=f1.listFiles();
		int count=0;
		for(int i=0;i<=f2.length-1;i++)
		{
			String path=f2[i].getName();
			if(path.contentEquals("Hanuman"))
			{
				count=count+1;
				System.out.println("file is found in the sample folder: "+path);
			}
			
		}
		if(count==0)
		{
			System.out.println("file is not found in the given folder");
		}
		
	}

}
