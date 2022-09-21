package com.sgtesting.constructoroverloadingandchaining;
class Character
{
	void characterarray(char a[][])
	
	{
	     for(int i=a.length-1;i>=0;i--)
	     {
	    	 for(int j=a[i].length-1;j>=0;j--)
	    	 {
	    		 System.out.print(a[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
	}
}

public class Methodwithparameter {

	public static void main(String[] args) {
		Character arr=new Character();
		char c[][]= {{'s','d','g'},{'r','u','p'}};
		arr.characterarray(c);

	}

}
