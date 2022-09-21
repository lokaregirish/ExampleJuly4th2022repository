package com.sgtesting.fileprograms;

import java.io.File;

public class ReadExcel {

	public static void main(String[] args) {
		ReadExcel();
		Readnotepad();

	}
	private static void ReadExcel()
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample\\Test1.xlsx");
		System.out.println("Is it readable?:"+f1.canRead());
		System.out.println("Is it writable?:"+f1.canWrite());
		System.out.println("Is it execute?:"+f1.canExecute());
	}
	private static void Readnotepad()
	{
		File f1=new File("E:\\WELCOME\\Demo\\Sample\\Test1.txt");
		System.out.println("Is it readable?:"+f1.canRead());
		System.out.println("Is it writable?:"+f1.canWrite());
		System.out.println("Is it execute?:"+f1.canExecute());
		
	}

}
