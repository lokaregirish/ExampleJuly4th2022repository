package com.sgtesting.constructoroverloadingandchaining;
class Mathsactions3
{
	Mathsactions3(int x,int y,String actions)
	{
		int res;
		switch (actions)
		{
		case "add":
			res=x+y;
			System.out.println("addtion of parameters:  "+res);
			break;
		case "sub":
			res=x-y;
			System.out.println("substraction of parameters:  "+res);
			break;
		case "mul":
			res=x*y;
			System.out.println("multiplication of parameters:  "+res);
			break;
		case "div":
			res=x/y;
			System.out.println("division of parameters:  "+res);
			break;
			default:
				System.out.println("invalid action");
			
		}
	}
}

public class Mathsactionsusingconstructor {

	public static void main(String[] args) {
		Mathsactions3 giri=new Mathsactions3(25,6,"add");
		Mathsactions3 giri1=new Mathsactions3(25,6,"sub");
		Mathsactions3 giri2=new Mathsactions3(25,6,"mul");
		Mathsactions3 giri3=new Mathsactions3(25,6,"div");
		Mathsactions3 giri4=new Mathsactions3(25,6,"giri");
		

	}

}
