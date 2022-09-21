package com.sgtesting.constructoroverloadingandchaining;
class Player
{
	Player(String pname,int playerid)
	{
		System.out.println("player name: "+pname+"   Player id: "+playerid);
	}
	Player(int runscored)
	{
		this("sachin",01);
		System.out.println("run scored: "+runscored);
		
	}
}

public class Chainingconstructorplayer {

	public static void main(String[] args) {
		Player S=new Player(56);

	}

}
