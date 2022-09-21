package com.sgtesting.Stringprograms;

public class Stringprograms {

	public static void main(String[] args) {
		Contains();
		Reverse();
		Stringmechanism();

	}
	private static void Contains()
	{
		String s="name of tha movie is harrypotter";
		boolean j=s.contains("movie");
		System.out.println(j);
		boolean h=s.startsWith("name");
		System.out.println(h);
		boolean k=s.endsWith("harrypotter");
		System.out.println(k);
	}
	private static void Reverse()
	{
		String h="brother";
		StringBuffer m=new StringBuffer(h);
		System.out.println(m);
		char s1[]=h.toCharArray();
		for(char kk:s1)
		{
			System.out.println(kk);
		}
	}
	private static void Stringmechanism()
	{
		StringBuilder s=new StringBuilder("loki ");
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s);
		System.out.println(s1);
		s.append("universe ");
		System.out.println(s);
		s.append("madness ");
		System.out.println(s);
		String s3="loki universe madness";
		String s4=s3.replace("loki","spiderman");
		System.out.println(s4);
		String h="SUNDAYMONDAYTUESDAY";
		String h1=h.replaceAll("DAY","");
		System.out.println(h1);
		String j="the world has a new enemy";
		int y=j.indexOf("world");
		System.out.println(y);
		String j1=j.concat(" old");
		System.out.println(j1);
		char c[]= {'h','e','l','l','o'};
		String s5=new String(c);
		System.out.println(s5);
		int p=645;
		String u=String.valueOf(p);
		System.out.println(u);
		char t='e';
		String t1=String.valueOf(t);
		System.out.println(t1);
		char ii[]= {'w','r','t','o'};
		String v=String.valueOf(ii);
		System.out.println(v);
		int yy=j.lastIndexOf("new");
		System.out.println(yy);
		StringBuilder g=new StringBuilder("janaki");
		g.append(" is a good girl");
		System.out.println(g);
		g.append(25.5);
		System.out.println(g);
		String ss="new user";
		System.out.println(ss.length());
		
		
		
	}

}
