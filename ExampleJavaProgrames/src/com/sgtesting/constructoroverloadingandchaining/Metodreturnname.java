package com.sgtesting.constructoroverloadingandchaining;
class Nmae
{
	String Name(String myname)
	{
		return myname;
	}
}

public class Metodreturnname {

	public static void main(String[] args) {
		Nmae tt=new Nmae();
		String name=tt.Name("girish");
		System.out.println(name);
	

	}

}
