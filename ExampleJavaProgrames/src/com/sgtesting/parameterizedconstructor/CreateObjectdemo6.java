package com.sgtesting.parameterizedconstructor;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
	
	Employee(String en,int ei,String emp)
	{
		employeename=en;
		employeeid=ei;
		employeejoiningdate=emp;
		System.out.println("Employee name:"+employeename+" employee id:"+employeeid+" joining date of employee:"+employeejoiningdate);
        System.out.println("++++++++++++++");	
	}
}

class Department
{
	String departmentname;
	int departmentid;
	String managername;
	
	Department(String dn,String ma,int di)
	{
		departmentname=dn;
        departmentid=di;
        managername=ma;
        System.out.println("Department name:"+departmentname+" department id:"+departmentid+" name of manager:"+managername);
        System.out.println("++++++++++++++");	
	}
}

class Insuranceprovider
{
	String insprovider;
	int insuranceid;
	String interest;
	
	Insuranceprovider(String ip,int ii,String in)
	{
		insprovider=ip;
        insuranceid=ii;
        interest=in;
        System.out.println("insurance provider:"+insprovider+" insurance id:"+insuranceid+" rate of interst:"+interest);
        System.out.println("++++++++++++++");	
	}
}

public class CreateObjectdemo6 {

	public static void main(String[] args) {
		Employee santu=new Employee("Santosh",46,"15 jul 2019");
		
        Department sales=new Department("Sales","Naveen",65);
        
        Insuranceprovider health=new Insuranceprovider("Health",23,"15%");
        
        
        
	}

}
