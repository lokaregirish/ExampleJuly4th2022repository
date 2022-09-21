package com.sgtesting.constructoroverloadingandchaining;
class Maths
{
	Maths(String lecturename,int lectureid)
	{
				System.out.println("lecture name: "+lecturename+"   lecture id: "+lectureid);
	}
	Maths(int marksscored)
	{
		this("guru",34);
		System.out.println("run scored: "+marksscored);		
	}
}

public class ChainingconstructorMaths {

	public static void main(String[] args) {
		Maths S=new Maths(98);

	}

}
