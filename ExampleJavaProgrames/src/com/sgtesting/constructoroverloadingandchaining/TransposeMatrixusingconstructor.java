package com.sgtesting.constructoroverloadingandchaining;
class Transpose
{
	Transpose(int a[][])	
	{
		  int k=0;
	      int c[][]=new int[a.length][a[k].length];
	      for(int i=0;i<=a.length-1;i++)
	      {
	    	  for(int j=0;j<=a[i].length-1;j++)
	    	  {
	    		  c[j][i]=a[i][j];
	    	  }	    		  
	      }
	      for(int m=0;m<=c.length-1;m++)
			{
				for(int y=0;y<=c[k].length-1;y++)
				{
				     System.out.print(c[m][y]+"   ");
				}
				System.out.println();
			}

	      
	}
}

public class TransposeMatrixusingconstructor {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		Transpose array=new Transpose(arr);

	}

}
