package Recursion;
/* WAJP to define a recursive method to return how many digits present in the no.
*/
public class MainRec5 
{
	public static void main(String[] args) 
	{
		int dc=countDigits(984);
		System.out.println(dc);
	}

	public static int countDigits(int n) 
	{
		if(n<10)
			return 1;
		return 1+countDigits(n/10);
	}
}
