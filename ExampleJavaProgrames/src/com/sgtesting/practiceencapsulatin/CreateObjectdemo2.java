package com.sgtesting.practiceencapsulatin;
class Laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
}

class Desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
}
 
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
}

public class CreateObjectdemo2 {


	public static void main(String[] args) {
		Laptop dell=new Laptop();
		dell.laptopname="Dell";
		dell.laptopcost=25000;
		dell.ownername="Girish";
		System.out.println("laptop name:"+dell.laptopname+" cost:"+dell.laptopcost+" ownername:"+dell.ownername);
		System.out.println("++++++++++++++++++");
		Desktop windows=new Desktop();
		windows.desktopname="windows";
		windows.desktopcost=8000;
		windows.desktopvendor="MS office";
		System.out.println("desktop name:"+windows.desktopname+" cost:"+windows.desktopcost+" desktopvendor:"+windows.desktopvendor);
		System.out.println("++++++++++++++++++");
		Mobile apple=new Mobile();
		apple.mobilename="Apple";
		apple.mobilecost=550000;
		apple.mobilecompany="apple";
		System.out.println("mobile name:"+apple.mobilename+" cost:"+apple.mobilecost+" mobilecompany:"+apple.mobilecompany);
		System.out.println("++++++++++++++++++");
		
		
		
	}

}
