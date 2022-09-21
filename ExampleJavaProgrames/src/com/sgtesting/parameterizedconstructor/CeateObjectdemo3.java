package com.sgtesting.parameterizedconstructor;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
	
	Animals(String an,String ab,String cn)
	{
		animalname=an;
	    animalbreed=ab;
		classname=cn;
		System.out.println("animal name:"+animalname+" breed name:"+animalbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}

class Birds
{
	String birdname;
	String birdbreed;
	String classname;
	
	Birds(String bn,String bb,String cn)
	{
		birdname=bn;
		birdbreed=bb;
		classname=cn;
		System.out.println("bird name:"+birdname+" bird breed:"+birdbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Insects
{
	String insectname;
	String insectbreed;
	String classname;
	
	Insects(String in,String ib,String cn)
	{
	    insectname=in;
		insectbreed=ib;
		classname=cn;
		System.out.println("insect name:"+insectname+" insect breed:"+insectbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}

public class CeateObjectdemo3 {


	public static void main(String[] args) {
		Animals tiger=new Animals("tiger","bengal tiger","mammalia");
		
		Birds parrot=new Birds("parrot","African grey parrot","Reptiles");
		
		Insects ant=new Insects("ant","Carpenter ants","Insecta");
		
		
		
		
	}

}
