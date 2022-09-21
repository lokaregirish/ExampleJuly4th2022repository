package com.sgtesting.aftermethods;
class Substraction
{
	int x,y;
	void substraction(Substraction mm)
	{
		mm.x+=200;
		mm.y*=7;
		System.out.println(x);
		System.out.println(y);
	}
}

public class classbyreference {

	public static void main(String[] args) {
		Substraction mm=new Substraction();
		mm.x=25;
		mm.y=35;
		System.out.println(mm.x);
		System.out.println(mm.y);
		mm.substraction(mm);
		System.out.println(mm.x);
		System.out.println(mm.y);
		

	}

}
