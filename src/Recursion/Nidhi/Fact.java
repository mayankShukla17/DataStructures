package Recursion.Nidhi;

import java.util.Scanner;

public class Fact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int a=factor(n);
		System.out.println(a);
	}
	public static int factor(int n)
	{
		if(n==1||n==0)
			return 1;
		return n*factor(n-1);
	}

}
