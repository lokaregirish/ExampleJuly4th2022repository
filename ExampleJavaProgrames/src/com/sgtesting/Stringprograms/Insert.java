package com.sgtesting.Stringprograms;

public class Insert {

	public static void main(String[] args) {
		Insertby();

	}
	private static void Insertby()
	{
		StringBuffer s=new StringBuffer("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
		StringBuffer s1=s.insert(6, ',');		
		StringBuffer s2=s1.insert(13, ',');
		StringBuffer s3=s2.insert(21, ',');		
		StringBuffer s4=s3.insert(31, ',');
		StringBuffer s5=s4.insert(40, ',');
		StringBuffer s6=s5.insert(47, ',');
		System.out.println(s6);
		//2nd approach
	    String hh="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		String s9=hh.replace("DAY","DAY,");
		System.out.println(s9);
		
	}

}
