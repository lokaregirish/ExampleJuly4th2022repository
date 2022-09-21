package com.sgtesting.stsaticprogrames;
class Singleton1
{
	static Singleton1 obj=null;
	private Singleton1()
	{
		//private constructor
	}
	void school()
	{
		String sname="giri";
		int rollno=17;
		System.out.println(sname);
		System.out.println(rollno);
	}
	int Room(int roomno)
	{
		return roomno;
	}
	static Singleton1 getinstance()
	{
		if(obj==null)
		{
			obj=new Singleton1();
		}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton1 ob=Singleton1.getinstance();
		ob.school();
		int h=ob.Room(25);
		System.out.println(h);

	}

}
