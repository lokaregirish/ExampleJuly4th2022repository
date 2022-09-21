package com.sgtesting.abstractprograms;
abstract class Studentaa
{
	 void Library(int cardno,int rollno)
	{
		System.out.println("cardno in library method: "+cardno);
		System.out.println("roll no: "+rollno);
	}
}
class Studentbb extends Studentaa
{
	
}
public class Instancemethodinabstract {

	public static void main(String[] args) {
		Studentbb hh=new Studentbb();
		hh.Library(25,78);

	}

}
