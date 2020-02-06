package SortingTechniques.SequentialSortingTechniques.SelectionSort;
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]={34,56,23,58,67,45,24};
		selectionSort(ar);
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void selectionSort(int[] ar) 
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			int in=i;
			for (int j = i+1; j < ar.length; j++) 
			{
				if (ar[j]<ar[in]) 
				{
					in=j;
				}
			}
			int t=ar[in];
			ar[in]=ar[i];
			ar[i]=t;
		}
	}
}
