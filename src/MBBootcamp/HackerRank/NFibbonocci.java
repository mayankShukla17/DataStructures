package MBBootcamp.HackerRank;
/*Wajp to print fibbonocci no in an array of n size and the last element must not be greater than n.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class NFibbonocci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		ArrayList<Integer> al1=new ArrayList<Integer>(n);
		al=printFibbonocci(n);
		for (int i = 0; i <n; i++) 
		{
			if (al.get(i)<=n) {
				al1.add(al.get(i));
			}
		}
		System.out.println(al1);
	}
	private static ArrayList<Integer> printFibbonocci(int n) 
	{
		int f1=0,f2=1,f3;
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		while (n>0)
		{
			al.add(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return al;
	}
}
