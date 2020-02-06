package BinarySearch;
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]={18,26,28,35,45,58,65};
		int in=binarySearch(ar,65,0,ar.length-1);
		if(in>-1)
			System.out.println("Yes it is present in the index "+in);
		else
			System.out.println("No it is not present");
	}

	public static int binarySearch(int[] a, int ele, int l, int h) 
	{
		if(l>h)
			return -1;
		int m=(l+h)/2;
		if(a[m]==ele)
			return m;
		if(a[m]>ele)
			return binarySearch(a, ele, l, m-1);
		else
			return binarySearch(a, ele, m+1, h);
	}
}
