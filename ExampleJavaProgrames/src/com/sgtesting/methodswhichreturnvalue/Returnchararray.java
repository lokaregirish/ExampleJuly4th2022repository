package com.sgtesting.methodswhichreturnvalue;
class Character
{
	char[][] Char()
	{
		char kk[][]= {{'e','t','o'},{'l','k','r'}};
	    return kk;
	}
}

public class Returnchararray {

	public static void main(String[] args) {
		Character oo=new Character();
		char ll[][]=oo.Char();
		for(int m=0;m<=ll.length-1;m++)
		{
			for(int u=0;u<=ll[m].length-1;u++)
			{
				System.out.print(ll[m][u]+"  ");
			}
			System.out.println();
		}

	}

}
