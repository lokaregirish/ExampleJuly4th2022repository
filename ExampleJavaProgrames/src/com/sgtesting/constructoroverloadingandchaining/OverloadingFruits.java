package com.sgtesting.constructoroverloadingandchaining;
class Fruits
{
	Fruits(String fruitname,int cost)
	{
		System.out.println("Fruit name: "+fruitname+" cost : "+cost);
	}
	Fruits(String quantity)
	{
		System.out.println("Quantity: "+quantity);
	}
	Fruits(int nooffruitsgot)
	{
		System.out.println(" no of fruits:"+nooffruitsgot);
	}


	
}

public class OverloadingFruits {

	public static void main(String[] args) {
		Fruits o1=new Fruits("Mango",90);
		Fruits o2=new Fruits("3kg");
		Fruits o3=new Fruits(9);

	}

}
