package com.sgtesting.methodswhichreturnvalue;
class Prime2
{
	boolean Primenumber2(int num)
	{
	    boolean d=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				d=false;
				break;
			}
			
		}
		return d;
		
	}
}

public class  Booleanvalforprime {

	public static void main(String[] args) {
		Prime2 jj=new Prime2();
		boolean yy=jj.Primenumber2(7);
        System.out.println(yy);
		

	}

}
