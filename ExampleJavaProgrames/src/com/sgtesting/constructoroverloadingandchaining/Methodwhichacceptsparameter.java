package com.sgtesting.constructoroverloadingandchaining;
class Mathsactions2
{
	void addition(int x,int y)
	{
		int res=x+y;
		int m=x-y;
		System.out.println(res+","+m);
	}
	void Multiplication(int t,int u)
	{
		int res=t*u;
		System.out.println(res);
	}
}

public class Methodwhichacceptsparameter {

	public static void main(String[] args) {
		Mathsactions2 arr=new Mathsactions2();
		arr.addition(25, 23);
		arr.Multiplication(3, 9);
		

	}

}
