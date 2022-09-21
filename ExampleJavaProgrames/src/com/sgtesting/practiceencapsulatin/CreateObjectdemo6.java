package com.sgtesting.practiceencapsulatin;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
}

class Department
{
	String departmentname;
	int departmentid;
	String managername;
}


class Insuranceprovider
{
	String insprovider;
	int insuranceid;
	String interest;
}

public class CreateObjectdemo6 {

	public static void main(String[] args) {
		Employee santu=new Employee();
		santu.employeename="Santosh";
		santu.employeeid=46;
		santu.employeejoiningdate="15 jul 2019";
		System.out.println("Employee name:"+santu.employeename+" employee id:"+santu.employeeid+" joining date of employee:"+santu.employeejoiningdate);
        System.out.println("++++++++++++++");
		
        Department sales=new Department();
        sales.departmentname="sales";
        sales.departmentid=65;
        sales.managername="naveen";
        System.out.println("Department name:"+sales.departmentname+" department id:"+sales.departmentid+" name of manager:"+sales.managername);
        System.out.println("++++++++++++++");
       
        Insuranceprovider health=new Insuranceprovider();
        health.insprovider="Health";
        health.insuranceid=23;
        health.interest="15%";
        System.out.println("insurance provider:"+health.insprovider+" insurance id:"+health.insuranceid+" rate of interst:"+health.interest);
        System.out.println("++++++++++++++");

        
        
	}

}
