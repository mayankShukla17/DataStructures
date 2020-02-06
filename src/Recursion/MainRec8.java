package Recursion;
/*WAJPT define a recursive method to return nth fibbonocci no.
*/
public class MainRec8 
{
	public static void main(String[] args) 
	{
		int f=fib(5);
		System.out.println(f);
	}

	public static int fib(int n) 
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
