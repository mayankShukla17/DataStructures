package Recursion;
import java.util.Scanner;
/*WAJP to write a recursive method where user entered no is n.
 * 3=3 2 1 1 2 3 
 * 5=5 4 3 2 1 1 2 3 4 5
*/
public class MainRec13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n.");
		int n=sc.nextInt();
		print(n); //5
	}

	public static void print(int n) 
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		print(n-1);
		System.out.print(n+" ");
	}
}
