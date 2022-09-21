package com.sgtesting.methodswhichreturnvalue;
class Value
{
	int addition(int x,int y)
	{
		int res=(x+y);
		return res;
	}
	int multiplication(int x,int y)
	{
		int res=x*y;
		return res;
	}
	void division(int a,int b)
	{
		int ans=b/a;
		System.out.println(ans);
	}
}

public class Returnvalueuseasparameter {

	public static void main(String[] args) {
	
         Value vv=new Value();
         //int h=vv.addition(3, 4);
         //int y=vv.multiplication(2, 20);
         // vv.division(h, y);
         vv.division(vv.addition(12, 6), vv.multiplication(2, 20));
         
	}

}
