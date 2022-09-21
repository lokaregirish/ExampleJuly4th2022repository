package com.sgtesing.inheritanceprograms;
class Maths12
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Maths22 extends Maths12
{
	void substraction(int p,int q)
	{
		int sub=p-q;
		System.out.println(sub);
	}
}
class Maths3 extends Maths22
{
	void multiplication(int a,int b)
	{
		int mult=a*b;
		System.out.println(mult);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Maths3 obj=new Maths3();
		obj.addition(2, 3);
		obj.substraction(12, 5);
		obj.multiplication(34, 2);

	}

}
