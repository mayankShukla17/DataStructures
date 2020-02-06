package ImportantPrograms;
import java.util.Scanner;
//I/P:-jspiders  & s (Remove s)
//O/P:-2
public class Prog1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		char ch=sc.next().charAt(0);
		String s2=s1.replaceAll(ch+"","");
		System.out.println(s2);
		System.out.println(s1.length()-s2.length());
	}
}
