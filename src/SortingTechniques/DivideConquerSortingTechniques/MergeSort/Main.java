package SortingTechniques.DivideConquerSortingTechniques.MergeSort;
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]= {38,27,43,3,9,82,10};
		mergeSort(ar,0,6);
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void mergeSort(int[] a, int l, int h) 
	{
		if(l<h)
		{
			int m=(l+h)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, h);
			merge(a,l,m,h);
		}
	}

	public static void merge(int[] a, int l, int m, int h) 
	{
		int b[]=new int[h-l+1];
		int i=l,k=0;
		int j=m+1;
		while(i<=m && j<=h) 
		{
			if(a[i]<a[j])
				b[k++]=a[i++];
			else
				b[k++]=a[j++];
		}
		while(i<=m)
			b[k++]=a[i++];
		while(j<=h)
			b[k++]=a[j++];
		for (k = 0; k < b.length; k++) 
			a[l+k]=b[k];
	}
}
