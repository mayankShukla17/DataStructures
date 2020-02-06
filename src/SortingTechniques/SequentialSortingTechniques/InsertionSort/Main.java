package SortingTechniques.SequentialSortingTechniques.InsertionSort;
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]={34,56,23,58,67,45,24};
		insertionSort(ar);
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void insertionSort(int[] ar) 
	{
		for (int i = 1; i < ar.length; i++) 
		{
			int ele=ar[i];
			int j=i-1;
			while(j>=0&&ele<ar[j])
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=ele;
		}
	}
}
