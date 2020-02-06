package Recursion;
import java.util.Scanner;
/* WAJPT check user entered no is prime or not without using loop.
 */
public class MainRec7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check for prime.");
		int p=sc.nextInt();
		if(isPrime(p,2))
			System.out.println("Prime");
	}

	public static boolean isPrime(int n, int i) 
	{
		if(n%i==0)
			return false;
		if(i>n/2)
			return true;
		return isPrime(n, i+1);
	}
}
