package Recursion;
/* WAJP to write recursive method to print the no. from 1-n.
*/
public class MainRec2 
{
	public static void main(String[] args) 
	{
		display(5);
	}

	public static  void display(int n) 
	{
		if(n>1)
			display(n-1);
		System.out.print(n);
	}
}
