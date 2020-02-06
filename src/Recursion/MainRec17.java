package Recursion;

import java.util.Scanner;

//WAP to check user given no is perfect or not.
public class MainRec17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		boolean rs=isPerfect(n,1,0);
		if(rs)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");
	}

	static boolean isPerfect(int n, int i, int sum) {
		if(i>n/2) {
			if(sum==n)
				return true;
			else
				return false;
		}
		if(n%i==0)
			sum=sum+i;
		return isPerfect(n, i+1, sum);
	}
}
