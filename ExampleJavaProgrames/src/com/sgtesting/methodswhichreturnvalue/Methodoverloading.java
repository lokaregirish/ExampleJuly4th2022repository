package com.sgtesting.methodswhichreturnvalue;
class Overloading
{
	void addition()
	{
		int x=12;
		int y=15;
		int res=x+y;
		System.out.println(res);
	}
	int addition(int x,int y)
	{
		int res=x+y;
		return res;
	}
	int addition(int x)
	{
		int t=this.addition(15,56);
		int y=22;
		int res=x+y+t;
		return t;
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		    Overloading ol=new Overloading();
		    ol.addition();
		    //ol.addition(15, 78);
		    //ol.addition(45, 90);
		    //int t=ol.addition(15);
		    int y=ol.addition(56);
		    System.out.println(y);
		    //System.out.println(y);
		    

	}

}
