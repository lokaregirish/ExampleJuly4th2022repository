package com.sgtesting.stsaticprogrames;
class Singleobject
{
	static Singleobject obj=null;
	private Singleobject()
	{
		
	}
	void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	void Substraction(int p,int q)
	{
		int sub=p-q;
		System.out.println(sub);	
	}
	public static Singleobject getinstance()
	{
		//if(obj==null)
		//{
			Singleobject obj=new Singleobject();
		//}
		
		return obj;
	}
}

public class Singleton {

	public static void main(String[] args) {
		Singleobject newobj=Singleobject.getinstance();
		newobj.addition(23, 45);
		newobj.Substraction(23, 13);
		Singleobject newobj2=Singleobject.getinstance();
		newobj2.addition(23, 45);
		newobj2.Substraction(23, 13);
		Singleobject newobj3=Singleobject.getinstance();
		newobj3.addition(23, 45);
		newobj3.Substraction(23, 13);
		if((newobj==newobj2)&&(newobj2==newobj3))
		{
			System.out.println("all the objects are same");
		}
		else
		{
			System.out.println("all the objects are different");
		}

		
		

	}

}
