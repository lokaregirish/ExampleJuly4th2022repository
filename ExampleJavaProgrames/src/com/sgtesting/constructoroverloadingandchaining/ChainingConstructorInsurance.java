package com.sgtesting.constructoroverloadingandchaining;
class Insurance
{
	Insurance(String insuranceprovider,int insuranceid)
	{
		this("15%");
		System.out.println("insurance provider name: "+insuranceprovider+"   insurance id: "+insuranceid);
	}
	Insurance(String insuranceinterest)
	{
		
		System.out.println("interest: "+insuranceinterest);
		
	}
}

public class ChainingConstructorInsurance {

	public static void main(String[] args) {
		Insurance S=new Insurance("ragu",67);

	}

}
