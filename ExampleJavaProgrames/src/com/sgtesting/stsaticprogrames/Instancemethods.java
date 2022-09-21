package com.sgtesting.stsaticprogrames;
class Instance
{
	{
		System.out.println("this is a instance block!!!");
	}
	void method1(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Instance2
{
	void method2(int p,int q)
	{
		Instance mm=new Instance();
		mm.method1(25, 78);
		int sub=p-q;
		System.out.println(sub);
	}

}
public class Instancemethods {

	public static void main(String[] args) {
		Instance2 kk=new Instance2();
		kk.method2(25, 5);
		
		

	}

}
