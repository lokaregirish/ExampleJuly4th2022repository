package com.sgtesting.characaterstream;
class Mathsaction implements Runnable
{

	public void run() 
	{
		Evennumber();		
	}
	void Evennumber()
	{
		try
		{
			
		for(int i=20;i<=40;i++)
		{
			Thread.sleep(1000);
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		Mathsaction job=new Mathsaction();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("huliya");
		t2.setName("iliya");
		t1.start();
		t2.start();
		

	}

}
