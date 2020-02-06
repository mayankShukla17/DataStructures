package VinnovateLabs;
import java.util.Scanner;
//I/P:-5 2 4 
//O/P:-2 4 5 "YES"
//I/P:-5 4 3 
//O/P:-4 3 5 "NO"
//I/P:-1 4 3 
//O/P:-4 3 1 "NO"
//I/P:-1 5 1
//O/P:-1 1 5 "YES"
public class Trimino 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nos.");
		int a[]=new int[3];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isTrimino(a));
	}

	public static boolean isTrimino(int a[])
	{
		int count=2;
		do {
			if(a[2]>=a[1]&&a[1]>=a[0])
				return true;
			int t=a[1];
			int ar[]=new int[3];
			for (int i =1; i <ar.length; i++) 
				ar[i]=a[i-1];
			ar[0]=a[a.length-1];
			a=ar;
			count--;
		}while(count>=0);
		return false;
	}
}
