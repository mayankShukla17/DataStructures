package Recursion;
/* WAJP to write a recursive method to return the factorial of n.
*/
public class MainRec3 
{
	public static void main(String[] args) 
	{
		int f=fact(5);
		System.out.println(f);
	}

	public static int fact(int n) 
	{
		if(n==1 || n==0)
			return 1;
		return n*fact(n-1);
	}
}
