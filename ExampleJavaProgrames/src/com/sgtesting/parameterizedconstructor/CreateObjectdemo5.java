package com.sgtesting.parameterizedconstructor;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
	Hardware(String hn,int hi,String sn)
	{
		hardwarename=hn;
		hardwareid=hi;
		shopname=sn;
		System.out.println("hardware name:"+hardwarename+" hardware id:"+hardwareid+" shopname:"+shopname);
        System.out.println("++++++++++++++");	
	}
}

class Software
{
	String softwarename;
	int softwareid;
	String shopname;
	
	Software(String sn,int si,String son)
	{
        softwarename=sn;
        softwareid=si;
        shopname=son;
        System.out.println("software name:"+softwarename+" software id:"+softwareid+" shopname:"+shopname);
        System.out.println("++++++++++++++");
	}
}

public class CreateObjectdemo5 {

	public static void main(String[] args) {
		Hardware ram=new Hardware("RAM",46,"sangeetha");
		
        Software browser=new Software("Browser",65,"Sangeetha");

        
        
	}

}
