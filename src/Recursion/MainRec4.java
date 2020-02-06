package Recursion;
/* WAJP to write a recursive method to calc. the sum of first n natural number.
*/
public class MainRec4 
{
	public static void main(String[] args) 
	{
		int s=sum(5);
		System.out.println(s);
	}

	public static int sum(int n) 
	{
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
}
