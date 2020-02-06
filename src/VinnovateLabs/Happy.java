package VinnovateLabs;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Return the first repeated no in Happy no
public class Happy 
{
	public static int isHappy(int n) 
	{
		if(n<0)
			return n;
		Set<Integer> num=new HashSet<Integer>();
		num.add(n);
		do
		{
			int sum=0;
			do
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}while(n!=0);
			if(num.add(sum)==false)
				return sum;
			n=sum;
		}while(true);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no"); //4321 6543 0 -324
		int n=sc.nextInt();
		//System.out.println(isHappy(n));
		int rs=isHappy(n);
		if(rs<=0)
			System.out.println(false);
		else if(rs>1)
			System.out.println("The sequence repeats at "+rs+"(not happy)");
		else
			System.out.println("It's happy number (reaches 1)");
	}
}
