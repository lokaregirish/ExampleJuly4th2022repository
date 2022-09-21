package com.sgtesting.Stringprograms;

public class DeleteDayDemo3 {

	public static void main(String[] args) {
		String m=("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFFRIDAYSATURDAY");
		char k[]=m.toCharArray();
		int count=0;
		for(int j=0;j<=k.length-1;j++)
		{
			count=count+1;
		}
		
		for(int i=0;i<=k.length-1;i++)
		{
			if(k[i]=='D')
			{
				if(k[i+1]=='A')
				{
					if(k[i+2]=='Y')
					{
							i=i+3;
					}
				}
			}
			if(i<count)
			{
				System.out.print(k[i]);
			}
			else
			{
				break;
			}
			
		}


	}

}
