package com.sgtesing.inheritanceprograms;
class Action
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Action2 extends Action
{
	Action2()
	{
		super.addition(21,34);
	}
	void addition(int p,int q)
	{
		int sub=p+q;
		System.out.println(sub);
	}
}
class Action3 extends Action2
{
	Action3()
	{
		super.addition(25, 56);
	}
	void addition(int a,int b)
	{
		int mult=a+b;
		System.out.println(mult);
	}
}

public class Samemethodname {

	public static void main(String[] args) {
		Action3 obj=new Action3();
		obj.addition(2, 3);
		

	}

}
