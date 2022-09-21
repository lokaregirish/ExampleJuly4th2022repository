package com.sgtesing.inheritanceprograms;
class Library
{
	Library(String sname)
	{
		System.out.println("student name: "+sname);
	}
	Library(int rollno)
	{
		System.out.println("Student rollno: "+rollno);
	}
	Library(String branch,int roomno)
	{
		System.out.println("name of branch: "+branch+"  room no: "+roomno);
	}
}
class Library2 extends Library
{
	Library2(String nm)
	{
		super(nm);
	}
	Library2(int k)
	{
		super(k);
	}
	Library2(String fname,String city)
	{
		super("civil",45);
		System.out.println("name of father: "+fname+"  city name: "+city);
	}
}
class Library3 extends Library2
{
	Library3(String nm)
	{
		super(nm);
	}
	Library3(int k)
	{
		super(k);
	}
	Library3(String fn,String ci)
	{
		super(fn,ci);
	}
}
class Library4 extends Library
{
	Library4(String nm)
	{
		super(nm);
	}
	Library4(int k)
	{
		super(k);
	}
	Library4(String br,int rn)
	{
		super(br,rn);
	}
}

public class HybridSuperclass {

	public static void main(String[] args) {
		Library3 kk=new Library3("kailas","manglore");
		Library3 kk2=new Library3("jaggesh");
		Library3 kk3=new Library3(35);
		Library4 mm=new Library4("rakesh");
		Library4 mm2=new Library4("45");
		Library4 mm3=new Library4("cse",89);
		
		

	}

}
