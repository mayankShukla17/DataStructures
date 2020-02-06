package MBBootcamp.HackerRank;
import java.util.*;
public class BetweenTwoSets 
{
	public static int getTotalX(List<Integer> a, List<Integer> b) 
	{
		
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int n=sc.nextInt();
		int m=sc.nextInt();
		List<Integer> a=new ArrayList<Integer>(n);
		List<Integer> b=new ArrayList<Integer>(m);
		for (int i = 0; i < a.size(); i++) 
			a.add(sc.nextInt());
		for (int i = 0; i < b.size(); i++) 
			b.add(sc.nextInt());
		int rs=getTotalX(a,b);
		System.out.println(rs);
		sc.close();
	}
}
