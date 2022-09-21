package com.sgtesting.aftermethods;
class Addition
{
	void addition(int p,int q)
	{
		p+=100;
		q-=25;
		System.out.println(p);
		System.out.println(q);
	}
}

public class Callbyvaluedemo {

	public static void main(String[] args) {
		int p=10;
		int q=25;
		System.out.println(p);
		System.out.println(q);
		Addition nn=new Addition();
		nn.addition(45,30);
		System.out.println(p);
		System.out.println(q);

	}

}
