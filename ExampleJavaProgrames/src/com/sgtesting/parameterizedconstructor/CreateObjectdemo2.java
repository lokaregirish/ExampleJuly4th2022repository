package com.sgtesting.parameterizedconstructor;
class Laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
	
	Laptop(String ln,int lc,String on)
	{
		laptopname=ln;
		laptopcost=lc;
		ownername=on;
		System.out.println("laptop name:"+laptopname+" cost:"+laptopcost+" ownername:"+ownername);
		System.out.println("++++++++++++++++++");	
	}
}

class Desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
	
	Desktop(String dn,int dc,String dv)
	{
		desktopname=dn;
		desktopcost=dc;
		desktopvendor=dv;
		System.out.println("desktop name:"+desktopname+" cost:"+desktopcost+" desktopvendor:"+desktopvendor);
		System.out.println("++++++++++++++++++");
	}
}
 
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
	
	Mobile(String mn,int mc,String moc)
	{
		mobilename=mn;
		mobilecost=mc;
		mobilecompany=moc;
		System.out.println("mobile name:"+mobilename+" cost:"+mobilecost+" mobilecompany:"+mobilecompany);
		System.out.println("++++++++++++++++++");
	}
}

public class CreateObjectdemo2 {


	public static void main(String[] args) {
		Laptop dell=new Laptop("dell",55000,"Girish");
		
		Desktop windows=new Desktop("windows",25000,"ms office");
		
		Mobile apple=new Mobile("apple",77000,"Apple");
	
		
		
		
	}

}
