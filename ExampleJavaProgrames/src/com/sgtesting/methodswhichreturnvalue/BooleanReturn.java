package com.sgtesting.methodswhichreturnvalue;
class Boolean
{
	boolean addition(int x,int y)
	{
		boolean c=false;
		int sum=x+y;
		if(sum%2==0)
		{
			 c=true;
		}
		return c;
	}
}

public class BooleanReturn {

	public static void main(String[] args) {
		Boolean bb=new Boolean();
		boolean h=bb.addition(2, 2);
		System.out.println(h);
		boolean j=bb.addition(4, 3);
		System.out.println(j);
		

	}

}
