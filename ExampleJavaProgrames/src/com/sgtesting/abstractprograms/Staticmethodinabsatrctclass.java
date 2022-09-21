package com.sgtesting.abstractprograms;
abstract class StudentA
{
	static void Library()
	{
		String sname="jackie";
		System.out.println("sname in library method: "+sname);
	}
}
class StudentB extends StudentA
{
	
}
public class Staticmethodinabsatrctclass {

	public static void main(String[] args) {
		//StudentB hh=new StudentB();
		//hh.Library();
		StudentA.Library();

	}

}
