package Recursion;
/* WAJP to calc. the LCM(not by recursion).
*/
public class MainRec12 
{
	public static void main(String[] args) 
	{
		int lcm=lcm(15,25);
		System.out.println(lcm);
	}

	public static int lcm(int a, int b) 
	{
		int big=(a>b)?a:b;
		int lcm=big;
		while(lcm%a!=0||lcm%b!=0)
		{
			lcm=lcm+big;
		}
		return lcm;
	}
}
