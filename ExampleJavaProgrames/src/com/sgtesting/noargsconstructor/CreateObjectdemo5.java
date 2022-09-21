package com.sgtesting.noargsconstructor;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
	Hardware()
	{
		hardwarename="RAM";
		hardwareid=46;
		shopname="sangeetha";
		System.out.println("hardware name:"+hardwarename+" hardware id:"+hardwareid+" shopname:"+shopname);
        System.out.println("++++++++++++++");	
	}
}

class Software
{
	String softwarename;
	int softwareid;
	String shopname;
	
	Software()
	{
        softwarename="browser";
        softwareid=65;
        shopname="sangeetha";
        System.out.println("software name:"+softwarename+" software id:"+softwareid+" shopname:"+shopname);
        System.out.println("++++++++++++++");
	}
}

public class CreateObjectdemo5 {

	public static void main(String[] args) {
		Hardware ram=new Hardware();
		
        Software browser=new Software();

        
        
	}

}
