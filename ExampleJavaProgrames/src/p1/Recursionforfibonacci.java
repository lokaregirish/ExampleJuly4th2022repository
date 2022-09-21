package p1;
class Fibonacci
{
	static void fibonacciSeries(int num,int first,int second)
	{
		int third=first+second;
		first=second;
	    second=third;
	    System.out.println(third);
	    if(num>=1)
	    {
	    	Fibonacci.fibonacciSeries(num-1,first,second);
	    }
	    
				
	}
}

public class Recursionforfibonacci {

	public static void main(String[] args) {
		Fibonacci.fibonacciSeries(10,0,1);

	}

}
