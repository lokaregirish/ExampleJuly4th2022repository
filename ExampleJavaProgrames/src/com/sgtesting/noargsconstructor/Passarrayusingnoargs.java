package com.sgtesting.noargsconstructor;
class Array
{
	Array()
	{
		int a[]= {2,3,4,5,6,7};
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+"  ");
		}
	}
}

public class Passarrayusingnoargs {

	public static void main(String[] args) {
	     Array mm=new Array();

	}

}
