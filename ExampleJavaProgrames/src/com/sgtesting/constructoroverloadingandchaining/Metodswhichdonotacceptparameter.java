package com.sgtesting.constructoroverloadingandchaining;
class Mathsactions
{
	void Addition()
	{
		int y,m,res;
		y=25; m=35; res=y+m;
		System.out.println("addition of variables  "+res);
	}
	void Substraction()
	{
		int y,m,res;
		y=25; m=35; res=m-y;
		System.out.println("Substraction of variables  "+res);
	}
	void Multiplication()
	{
		int y,m,res;
		y=25; m=35; res=y*m;
		System.out.println("multiplication of variables  "+res);
	}


	
}

public class Metodswhichdonotacceptparameter {

	public static void main(String[] args) {
		Mathsactions ma=new Mathsactions();
		ma.Addition();
		ma.Substraction();
		ma.Multiplication();
		

	}

}
