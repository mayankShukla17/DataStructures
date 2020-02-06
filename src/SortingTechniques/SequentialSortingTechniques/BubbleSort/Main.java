package SortingTechniques.SequentialSortingTechniques.BubbleSort;
//Bubble Up Technique
public class Main 
{
	public static void main(String[] args) 
	{
		int ar[]={34,56,23,58,67,45,24};
		bubbleSort(ar);
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void bubbleSort(int[] ar) 
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = 0; j < ar.length-1-i; j++) 
			{
				if (ar[j]>ar[j+1]) 
				{
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
		}
	}
}
