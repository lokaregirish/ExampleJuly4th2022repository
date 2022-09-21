package com.sgtesting.constructoroverloadingandchaining;
class Character2
{
	void characterarray2(char a[][])
	
	{
		
		 char d[]=new char[a.length*a[0].length];
		 int k=0;
	     for(int i=0;i<=a.length-1;i++)
	     {
	    	 for(int j=0;j<=a[i].length-1;j++)
	    	 {
	    		 d[k]=a[i][j];
	    		 k++;
	    	 }
	     }
	     for(int m=d.length-1;m>=0;m--)
	     {
	    	 System.out.println(d[m]);
	     }
	}
}

public class Methodpassarray {

	public static void main(String[] args) {
		Character2 arr=new Character2();
		char c[][]= {{'s','d','g'},{'r','u','p'}};
		arr.characterarray2(c);

	}

}
