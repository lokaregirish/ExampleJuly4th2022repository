package com.sgtesing.inheritanceprograms;
class Static
{
	static int x,y;
	static void method1()
	{
		
		int res=x+y;
		System.out.println(res);
	}
	static void method2()
	{
		
		int sub=x-y;
		System.out.println(sub);
	}
}

public class Differentstaticmethods {

	public static void main(String[] args) {
		Static.x=25;
		Static.y=22;
		int res=Static.x+Static.y;
		System.out.println(res);
		Static.method1();
		Static.method2();

	}

}
