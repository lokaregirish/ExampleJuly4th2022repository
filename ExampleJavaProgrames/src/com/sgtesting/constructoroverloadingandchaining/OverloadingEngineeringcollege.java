package com.sgtesting.constructoroverloadingandchaining;
class Engineeringcollege
{
	Engineeringcollege(String sname,int rollno)
	{
		System.out.println("student name: "+sname+" roll no:"+rollno);
	}
	Engineeringcollege(String fathername)
	{
		System.out.println("father name: "+fathername);
	}
	Engineeringcollege(int roomno)
	{
		System.out.println(" room no:"+roomno);
	}


	
}

public class OverloadingEngineeringcollege {

	public static void main(String[] args) {
		Engineeringcollege o1=new Engineeringcollege("Girish",17);
		Engineeringcollege o2=new Engineeringcollege("Laxman");
		Engineeringcollege o3=new Engineeringcollege(25);

	}

}
