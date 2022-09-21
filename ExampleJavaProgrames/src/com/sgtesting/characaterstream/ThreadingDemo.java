package com.sgtesting.characaterstream;
class Myclass implements Runnable
{
	public void run()
	{
		System.out.println("this program run by thread");
	}

	
}

public class ThreadingDemo {

	public static void main(String[] args) {
		Myclass job=new Myclass();
		Thread t1=new Thread(job);
		t1.setName("giri");
		t1.start();
		

	}

}
