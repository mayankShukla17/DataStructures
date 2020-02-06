package MeanderingOrder;
import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Before Meandering");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		Arrays.sort(ar);
		System.out.println();
		int br[]=new int[ar.length];
		int k=0;
		for (int i=0, j=ar.length-1; i<=j; i++, j--) 
		{
			br[k++]=ar[j];
			if(k<br.length)
				br[k++]=ar[i];
		}
		System.out.println("After Meandering");
		for (int i = 0; i < br.length; i++) 
		{
			System.out.print(br[i]+" ");
		}
	}

	
	
//	public static void main(String[] args) 
//	{
//		int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 }; 
//		int n = arr.length; 
//		meanderingOrder(arr, n); 
//
//		for (int i = 0; i < n; i++) 
//			System.out.print(arr[i]+" "); 
//	}
//
//	private static void meanderingOrder(int[] arr, int n) 
//	{
//		// Sorting the array elements 
//		Arrays.sort(arr); 
//		int[] tempArr = new int[n]; // To store modified array 
//		// Adding numbers from sorted array to  
//		// new array accordingly 
//		int ArrIndex = 0; 
//		// Traverse from begin and end simultaneously  
//		for (int i = 0, j = n-1; i <= n / 2 || j > n / 2; i++, j--) 
//		{ 
//			if(ArrIndex < n) 
//			{ 
//				tempArr[ArrIndex] = arr[i]; 
//				ArrIndex++; 
//			} 
//
//			if(ArrIndex < n) 
//			{ 
//				tempArr[ArrIndex] = arr[j]; 
//				ArrIndex++; 
//			} 
//		} 
//		// Modifying original array 
//		for (int i = 0; i < n; i++) 
//			arr[i] = tempArr[i]; 
//	}
}
