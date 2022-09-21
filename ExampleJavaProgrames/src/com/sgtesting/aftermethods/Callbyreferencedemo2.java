package com.sgtesting.aftermethods;
class Mult
{
	int x, y;
	Mult Display(Mult bb)
	{
		x+=101;
		y-=25;
	     return bb;	
	}
}

public class Callbyreferencedemo2 {

	public static void main(String[] args) {
		Mult bb=new Mult();
		bb.x=56;
		bb.y=54;
		bb.Display(bb);
		System.out.println(bb.x);
		System.out.println(bb.y);

	}

}
