package com.sgtesting.methodswhichreturnvalue;
class Value2
{
	int addition(int a,int b)
	{
		int y=a+b;
		return y;
	}
	int substraction(int a,int b)
	{
		int u=a-b;
		return u;
	}
	void multiplication()
	{
		int a=this.addition(12,45);
		int b=this.substraction(25, 20);
		int res=a*b;
		//return res;
		System.out.println(res);
	}
}

public class Thisinmethodlevel {

	public static void main(String[] args) {
		Value2 mm=new Value2();
		mm.multiplication();
		//int kk=mm.multiplication();
		//System.out.println(kk);

	}

}
