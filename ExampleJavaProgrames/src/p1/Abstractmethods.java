package p1;
abstract class Parent1
{
	void displayname(String name)
	{
		System.out.println(name);
	}
}
abstract class Parent
{
	void displayname2(String name)
	{
		System.out.println(name);
	}
}
class Child1 extends Parent1
{
	void displayname(String name)
	{
		Child2 obj=new Child2();
		obj.displayname2("finish");
		System.out.println(name);
	}
}
class Child2 extends Parent
{
	void displayname2(String name)
	{
		System.out.println(name);
	}
}


public class Abstractmethods {

	public static void main(String[] args) {
		Child1 obj2=new Child1();
		obj2.displayname("jinka");

	}

}
