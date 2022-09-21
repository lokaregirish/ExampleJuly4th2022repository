package com.sgtesing.inheritanceprograms;
class Instance
{
	int x,y;
	void method1()
	{
		x=25;
		y=56;
		int res=x+y;
		System.out.println(res);
	}
	void method2()
	{
		x=65;
		y=56;
		int sub=x-y;
		System.out.println(sub);
	}
}

public class Differentmethods {

	public static void main(String[] args) {
		Instance pp=new Instance();
		pp.method1();
		pp.method2();
		

	}

}
