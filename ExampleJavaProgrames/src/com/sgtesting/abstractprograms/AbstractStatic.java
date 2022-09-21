package com.sgtesting.abstractprograms;
abstract class Student
{
	static
	{
		System.out.println("this is a static block in abstract class");
	}
}
class Student2 extends Student
{
	
}
public class AbstractStatic {

	public static void main(String[] args) {
		Student2 ob=new Student2();

	}

}
