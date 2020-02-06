package Recursion;
/* WAJPT to define a recursive method  to return index of specified 
 * element if it is there in the array otherwise return -1.
*/
public class MainRec9 
{
	public static void main(String[] args) 
	{
		int ar[]= {23,45,56,18,43,52};
		int ele=56;
		int in=search(ar,ele,0);
		System.out.println(in);
	}

	public static int search(int[] a, int ele, int i) 
	{
		if(i>a.length)
			return -1;
		if(a[i]==ele)
			return i;
		return search(a, ele, i+1);
	}
}
