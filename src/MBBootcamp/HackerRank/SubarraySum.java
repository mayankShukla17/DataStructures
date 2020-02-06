package MBBootcamp.HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SubarraySum 
{
	public static long subarraySum(List<Integer> arr)
	{
//		long sum=0;
//		Integer[] a=new Integer[arr.size()];
//		a=arr.toArray(a);
//		for (int i = 0; i <a.length; i++) 
//		{
//			sum+=a[i]*(a.length-i)*(1+i);
//		}
//		return sum;
		
		long sum=0;
		for (int i = 0; i <arr.size(); i++) 
		{
			sum+=arr.get(i)*(arr.size()-i)*(1+i);
		}
		return sum;

//		long result=0,temp=0;
//		for (int i = 0; i < arr.size(); i++) 
//		{
//			temp=0;
//			for (int j = i; j < arr.size(); j++) 
//			{
//				temp+=arr.get(j);
//				result+=temp;
//			}
//		}
//		return result;
	}
	public static void main(String[] args) 
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(4);
		li.add(5);
		li.add(6);
		System.out.println(subarraySum(li));
	}
}
