package com.sgtesting.aftermethods;
class Outer
{
	String s;
	Inner nn=new Inner();
	void Int()
	{
		nn.p=35;
		System.out.println(nn.p);
	}
	class Inner
	{
		int p;
		void String()
		{
			s="santhosh";
			System.out.println(s);
		}
	}
}

public class Outerandinnerclass {

	public static void main(String[] args) {
		Outer mm=new Outer();
		mm.nn.String();
		mm.Int();
		

	}

}
