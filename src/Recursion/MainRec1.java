package Recursion;
/* WAJP to write recursive method to print n-1 without using loop.
*/
public class MainRec1 
{
	public static void main(String[] args) 
	{
		print(5);
	}

	public static void print(int n) 
	{
		System.out.print(n);
		if(n>1)
			print(n-1);
	}
}
