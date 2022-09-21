package com.sgtesting.abstractprograms;
abstract class Employeeaa
{
	 Employeeaa(int companyno,int id)
	{
		System.out.println("cardno in library method: "+companyno);
		System.out.println("roll no: "+id);
	}
}
class Employeebb extends Employeeaa
{
	Employeebb(int cn,int i)
	{
		super(cn, i);
	}
}
public class Parameterinabstrct {

	public static void main(String[] args) {
		Employeebb hh=new Employeebb(25,78);

	}

}
