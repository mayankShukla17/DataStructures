package MBBootcamp.HackerRank;
import java.util.*;
public class AppleAndOrange 
{
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {
		int appleCount=0,orangeCount=0;
		for(int i=0;i<apples.length;i++)
		{
            if(a+apples[i]>=s&&a+apples[i]<=t)
            	appleCount++;
		}
	    for(int i=0;i<oranges.length;i++)
	    {
	        if(b+oranges[i]>=s&&b+oranges[i]<=t)
	        	orangeCount++;
	    }
	    System.out.println(appleCount);
	    System.out.println(orangeCount);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values");
		int s=sc.nextInt();			//Starting point
		int t=sc.nextInt();			//Ending point
		int a=sc.nextInt();			//Location of Apple Tree
		int b=sc.nextInt();			//Location of Orange Tree
		int m=sc.nextInt();			//Size of Apple integer array
		int n=sc.nextInt();			//size of Orange integer array
		int[] apples=new int[m];	//Apple array
		int[] oranges=new int[n];	//Orange array
		for (int i = 0; i <apples.length; i++) 
			apples[i]=sc.nextInt();
		for (int i = 0; i <oranges.length; i++) 
			oranges[i]=sc.nextInt();
		countApplesAndOranges(s,t,a,b,apples,oranges);
	}
}
