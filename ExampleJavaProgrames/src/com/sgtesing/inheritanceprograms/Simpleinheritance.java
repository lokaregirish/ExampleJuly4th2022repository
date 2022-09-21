package com.sgtesing.inheritanceprograms;
class Maths1
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Maths2 extends Maths1
{
	void Substraction(int p,int q)
	{
		int sub=p-q;
		System.out.println(sub);
	}
}

public class Simpleinheritance {

	public static void main(String[] args) {
		Maths2 mn=new Maths2();
		mn.addition(25, 24);
		mn.Substraction(12, 6);

	}

}
