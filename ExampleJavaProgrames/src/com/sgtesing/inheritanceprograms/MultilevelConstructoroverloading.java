package com.sgtesing.inheritanceprograms;
class Student
{
	Student(String sname)
	{
		System.out.println("student name: "+sname);
	}
	Student(int rollno)
	{
		System.out.println("Student rollno: "+rollno);
	}
	Student(String branch,int roomno)
	{
		System.out.println("name of branch: "+branch+"  room no: "+roomno);
	}
}
class Student2 extends Student
{
	Student2(String nm)
	{
		super(nm);
	}
	Student2(int k)
	{
		super(k);
	}
	Student2(String fname,String city)
	{
		super("civil",45);
		System.out.println("name of father: "+fname+"  city name: "+city);
	}
}
class Student3 extends Student2
{
	Student3(String nm)
	{
		super(nm);
	}
	Student3(int k)
	{
		super(k);
	}
	Student3(String fn,String ci)
	{
		super(fn,ci);
	}
}

public class MultilevelConstructoroverloading {

	public static void main(String[] args) {
		Student3 kk=new Student3("kailas","manglore");
		Student3 kk2=new Student3("jaggesh");
		Student3 kk3=new Student3(35);

	}

}
