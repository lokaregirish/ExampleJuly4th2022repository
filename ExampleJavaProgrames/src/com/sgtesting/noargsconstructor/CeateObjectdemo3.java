package com.sgtesting.noargsconstructor;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
	
	Animals()
	{
		animalname="apple";
	    animalbreed="bengal tiger";
		classname="mammalia";
		System.out.println("animal name:"+animalname+" breed name:"+animalbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}

class Birds
{
	String birdname;
	String birdbreed;
	String classname;
	
	Birds()
	{
		birdname="parrot";
		birdbreed="african grey parrot";
		classname="reptiles";
		System.out.println("bird name:"+birdname+" bird breed:"+birdbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}
 
class Insects
{
	String insectname;
	String insectbreed;
	String classname;
	
	Insects()
	{
	    insectname="ant";
		insectbreed="carpenter ants";
		classname="insecta";
		System.out.println("insect name:"+insectname+" insect breed:"+insectbreed+" class name:"+classname);
		System.out.println("++++++++++++++++++");	
	}
}

public class CeateObjectdemo3 {


	public static void main(String[] args) {
		Animals tiger=new Animals();
		
		Birds parrot=new Birds();
		
		Insects ant=new Insects();
		
		
		
		
	}

}
