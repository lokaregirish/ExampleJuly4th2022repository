package com.sgtesting.noargsconstructor;
class Laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
	
	Laptop()
	{
		laptopname="Dell";
		laptopcost=25000;
		ownername="Girish";
		System.out.println("laptop name:"+laptopname+" cost:"+laptopcost+" ownername:"+ownername);
		System.out.println("++++++++++++++++++");	
	}
}

class Desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
	
	Desktop()
	{
		desktopname="windows";
		desktopcost=8000;
		desktopvendor="MS office";
		System.out.println("desktop name:"+desktopname+" cost:"+desktopcost+" desktopvendor:"+desktopvendor);
		System.out.println("++++++++++++++++++");
	}
}
 
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
	
	Mobile()
	{
		mobilename="Apple";
		mobilecost=550000;
		mobilecompany="apple";
		System.out.println("mobile name:"+mobilename+" cost:"+mobilecost+" mobilecompany:"+mobilecompany);
		System.out.println("++++++++++++++++++");
	}
}

public class CreateObjectdemo2 {


	public static void main(String[] args) {
		Laptop dell=new Laptop();
		
		Desktop windows=new Desktop();
		
		Mobile apple=new Mobile();
	
		
		
		
	}

}
