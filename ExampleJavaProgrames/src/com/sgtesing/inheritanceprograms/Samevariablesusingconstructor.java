package com.sgtesing.inheritanceprograms;
class Roomno1
{
	int roomno;
	Roomno1()
	{
	     System.out.println("Room no 1: "+roomno);	
	}
}
class Roomno22 extends Roomno1
{
	int roomno;
	Roomno22()
	{
		super.roomno=55;
		System.out.println("Room no 2: "+roomno);
	}
}
class Roomno33 extends Roomno22
{
	int roomno;
	Roomno33()
	{
		super.roomno=45;	
	}
	Roomno33(int h)
	{
		roomno=h;
		System.out.println("Room no 3: "+h);
	}
}

public class Samevariablesusingconstructor {

	public static void main(String[] args) {
		Roomno33 hat=new Roomno33(25);
		

	}

}
