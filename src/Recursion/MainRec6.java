package Recursion;
/* WAJP to calc. the GCD of two no.
*/
public class MainRec6 
{
	public static void main(String[] args) 
	{
		int gcd=gcd(16,20);
		System.out.println(gcd);
	}

	public static int gcd(int m, int n) 
	{
		if(m<n)
			return gcd(n, m);
		if(n==0)
			return m;
		return gcd(n, m%n);
	}
}
