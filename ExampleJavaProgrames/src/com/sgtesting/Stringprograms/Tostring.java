package com.sgtesting.Stringprograms;
class Sentence
{
	 String name;
	 String branchname;
	Sentence(String name,String branchname)
	{
		this.name=name;
		this.branchname=branchname;
	}
	 public String toString()
	{
		return name+" is working in "+branchname;
	}
}

public class Tostring {

	public static void main(String[] args) {
		Sentence ss=new Sentence("rakshith","civil");
		System.out.println(ss);
		

	}

}
