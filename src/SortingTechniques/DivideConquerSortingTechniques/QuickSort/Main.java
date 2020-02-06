package SortingTechniques.DivideConquerSortingTechniques.QuickSort;
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]= {27,23,45,32,24,26,28,56,42};
		quickSort(ar,0,8);
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void quickSort(int[] a, int l, int h) 
	{
		if(l<h) 
		{
			int j=partition(a,l,h);
			quickSort(a, l, j-1);
			quickSort(a, j+1, h);
		}
	}

	public static int partition(int[] a, int l, int h) 
	{
		int pivote=a[l];
		int low=l+1;
		while(low<h)
		{
			while(a[low]<pivote)
				low++;
			while(a[h]>pivote)
				h--;
			if(low<h)
			{
				int t=a[low];
				a[low]=a[h];
				a[h]=t;
			}
		}
		a[l]=a[h];
		a[h]=pivote;
		return h;
	}
}
