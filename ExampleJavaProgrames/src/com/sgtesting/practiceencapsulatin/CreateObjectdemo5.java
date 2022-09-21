package com.sgtesting.practiceencapsulatin;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
}

class Software
{
	String softwarename;
	int softwareid;
	String shopname;
}

public class CreateObjectdemo5 {

	public static void main(String[] args) {
		Hardware ram=new Hardware();
		ram.hardwarename="RAM";
		ram.hardwareid=46;
		ram.shopname="sangeetha";
		System.out.println("hardware name:"+ram.hardwarename+" hardware id:"+ram.hardwareid+" shopname:"+ram.shopname);
        System.out.println("++++++++++++++");
        Software browser=new Software();
        browser.softwarename="browser";
        browser.softwareid=65;
        browser.shopname="sangeetha";
        System.out.println("software name:"+browser.softwarename+" software id:"+browser.softwareid+" shopname:"+browser.shopname);
        System.out.println("++++++++++++++");
        
        
	}

}
