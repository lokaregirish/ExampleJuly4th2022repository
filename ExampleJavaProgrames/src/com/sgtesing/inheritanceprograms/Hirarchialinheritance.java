package com.sgtesing.inheritanceprograms;
class Maths123
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Maths222 extends Maths123
{
	void substraction(int p,int q)
	{
		int sub=p-q;
		System.out.println(sub);
	}
}
class Maths33 extends Maths123
{
	void multiplication(int a,int b)
	{
		int mult=a*b;
		System.out.println(mult);
	}
}
class Maths44 extends Maths123
{
	void division(int y,int m)
	{
		int s=y/m;
		System.out.println(s);
	}
}

public class Hirarchialinheritance {

	public static void main(String[] args) {
		Maths33 obj=new Maths33();
		obj.addition(2, 3);
		obj.multiplication(34, 2);
		Maths222 jj=new Maths222();
		jj.substraction(23, 4);
		jj.addition(23, 34);
		Maths44 kk=new Maths44();
		kk.addition(23, 45);
		kk.division(25, 5);

	}

}
