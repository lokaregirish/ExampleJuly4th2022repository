package com.sgtesting.noargsconstructor;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
	
	Employee()
	{
		employeename="Santosh";
		employeeid=46;
		employeejoiningdate="15 jul 2019";
		System.out.println("Employee name:"+employeename+" employee id:"+employeeid+" joining date of employee:"+employeejoiningdate);
        System.out.println("++++++++++++++");	
	}
}

class Department
{
	String departmentname;
	int departmentid;
	String managername;
	
	Department()
	{
		departmentname="sales";
        departmentid=65;
        managername="naveen";
        System.out.println("Department name:"+departmentname+" department id:"+departmentid+" name of manager:"+managername);
        System.out.println("++++++++++++++");	
	}
}

class Insuranceprovider
{
	String insprovider;
	int insuranceid;
	String interest;
	
	Insuranceprovider()
	{
		insprovider="Health";
        insuranceid=23;
        interest="15%";
        System.out.println("insurance provider:"+insprovider+" insurance id:"+insuranceid+" rate of interst:"+interest);
        System.out.println("++++++++++++++");	
	}
}

public class CreateObjectdemo6 {

	public static void main(String[] args) {
		Employee santu=new Employee();
		
        Department sales=new Department();
        
        Insuranceprovider health=new Insuranceprovider();
        
        
        
	}

}
