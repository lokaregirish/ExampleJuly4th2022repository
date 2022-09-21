package com.sgtesting.practiceencapsulatin;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
}

class Birds
{
	String birdname;
	String birdbreed;
	String classname;
}
 
class Insects
{
	String insectname;
	String insectbreed;
	String classname;
}

public class CeateObjectdemo3 {


	public static void main(String[] args) {
		Animals tiger=new Animals();
		tiger.animalname="apple";
		tiger.animalbreed="bengal tiger";
		tiger.classname="mammalia";
		System.out.println("animal name:"+tiger.animalname+" breed name:"+tiger.animalbreed+" class name:"+tiger.classname);
		System.out.println("++++++++++++++++++");
		Birds parrot=new Birds();
		parrot.birdname="parrot";
		parrot.birdbreed="african grey parrot";
		parrot.classname="reptiles";
		System.out.println("bird name:"+parrot.birdname+" bird breed:"+parrot.birdbreed+" class name:"+parrot.classname);
		System.out.println("++++++++++++++++++");
		Insects ant=new Insects();
		ant.insectname="ant";
		ant.insectbreed="carpenter ants";
		ant.classname="insecta";
		System.out.println("insect name:"+ant.insectname+" insect breed:"+ant.insectbreed+" class name:"+ant.classname);
		System.out.println("++++++++++++++++++");
		
		
		
	}

}
