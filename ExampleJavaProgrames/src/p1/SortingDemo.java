package p1;
class Sorting 
{
	void Sort(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
	void Duplicate(String h[])
	{
		for(int i=0;i<=h.length-1;i++)
		{
			for(int j=i+1;j<=h.length-1;j++)
			{
				if(h[i].equals(h[j]))
				{
					System.out.println("Duplicate found :"+h[i]);
				}
			}
		}
	}
	void Duplicate2(int h[])
	{
		int count=0;
		for(int i=0;i<=h.length-1;i++)
		{
			for(int j=i+1;j<=h.length-1;j++)
			{
				if(h[i]==h[j])
				{
					System.out.println(h[i]);
				}
			}
		}
		System.out.println("+++++++++++++++++++++++");
		String m[]=new String[count];
		int k=0;
		for(int i=0;i<h.length-1;i++)
		{
			int counts=0;
			for(int j=0;j<h.length-1;j++)
			{
				if(h[i]==h[j])
				{
					System.out.println(h[i]);
				}
				
			}
					}
	}

}

public class SortingDemo {

	public static void main(String[] args) {
		Sorting so=new Sorting();
		int c[]= {3,6,1,8,5,4,3,5,3};
		//so.Sort(c);
		//String k[]={"fan","hat","lab","fan","cat","hat"};
		//so.Duplicate(k);
		//so.Duplicate2(c);
		String s="harish,girish,king,queen";
    	String h[]=s.split(",");
    	for(int i=0;i<h.length;i++)
    	{
    		System.out.println(h[i]);
    	}

	}

}
