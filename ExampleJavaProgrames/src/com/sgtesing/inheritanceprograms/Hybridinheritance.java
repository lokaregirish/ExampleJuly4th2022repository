package com.sgtesing.inheritanceprograms;
class Mathsa
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Mathsb extends Mathsa
{
	void substraction(int p,int q)
	{
		int sub=p-q;
		System.out.println(sub);
	}
}
class Mathsc extends Mathsb
{
	void multiplication(int a,int b)
	{
		int mult=a*b;
		System.out.println(mult);
	}
}
class Mathsd extends Mathsa
{
	void division(int x,int y)
	{
		int div=x/y;
		System.out.println(div);
	}
}

public class Hybridinheritance {

	public static void main(String[] args) {
		Mathsc obj=new Mathsc();
		obj.addition(2, 3);
		obj.substraction(12, 5);
		obj.multiplication(34, 2);
		Mathsd bb=new Mathsd();
		bb.addition(34, 56);
		bb.division(25, 5);

	}

}
