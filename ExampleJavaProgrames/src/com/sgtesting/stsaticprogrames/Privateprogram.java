package com.sgtesting.stsaticprogrames;
class Hostel
{
	private int roomlockno;
	static String sname;
	String friendname;
	static
	{
		sname="raju";
		System.out.println(sname);
	}
	Hostel()
	{
		friendname="ganesh";
		System.out.println(friendname);
	}
	public void setroomlockNo(int secretno)
	{
		roomlockno=secretno;
	}
	public int getroomlockNo()
	{
		return roomlockno;
	}
}

public class Privateprogram {

	public static void main(String[] args) {
		Hostel kk=new Hostel();
		kk.setroomlockNo(235);
		int y=kk.getroomlockNo();
        System.out.println(y);
	}

}
