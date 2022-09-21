package com.sgtesting.inheritanceprograms;
interface Market
{
	void vegetableName(String name); 
}
interface Shop 
{
	void Thingname(String name);
}
interface Cards 
{
	void cardname(String name);
}
class Child implements Market,Shop,Cards
{
	public void vegetableName(String name)
	{
		System.out.println("name of vegetable: "+name);
    }
	public void Thingname(String name)
	{
		System.out.println("name of thing : "+name);
	}
	public void cardname(String name)
	{
		System.out.println("name of card: "+name);
	}
	
}

public class Multipleinheritanceusing3interface {

	public static void main(String[] args) {
		Child kk=new Child();
		kk.vegetableName("carrot");
		kk.Thingname("bat");
		kk.cardname("king");

	}

}
