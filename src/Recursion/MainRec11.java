package Recursion;
/* WAJPT calc. the sum of array elements without using loop.
*/
public class MainRec11 
{
	public static void main(String[] args) 
	{
		int a[]= {23,45,56,18,24};
		int sum=sumOfArray(a,0);
		System.out.println(sum);
	}

	public static int sumOfArray(int[] ar, int in) 
	{
		if(in>=ar.length)
			return 0;
		return ar[in]+sumOfArray(ar, in+1);
	}
}
