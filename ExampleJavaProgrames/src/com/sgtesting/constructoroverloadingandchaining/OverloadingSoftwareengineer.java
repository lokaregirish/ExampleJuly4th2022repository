package com.sgtesting.constructoroverloadingandchaining;
class SoftwareEngineer
{
	SoftwareEngineer(String sname,int salary)
	{
		System.out.println("student name: "+sname+"salary is:"+salary);
	}
	SoftwareEngineer(String fathername)
	{
		System.out.println("father name: "+fathername);
	}
	SoftwareEngineer(int jobid)
	{
		System.out.println(" room no:"+jobid);
	}


	
}

public class OverloadingSoftwareengineer {

	public static void main(String[] args) {
		SoftwareEngineer o1=new SoftwareEngineer("hari",65000);
		SoftwareEngineer o2=new SoftwareEngineer("Laxman");
		SoftwareEngineer o3=new SoftwareEngineer(43);
	}

}
