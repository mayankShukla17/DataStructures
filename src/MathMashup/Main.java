package MathMashup;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you have to enter.");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements.");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println(fun(a.length,a,4));
	}
	static int fun(int N,int A[],int X) 
	{
		int U[]=new int[N];
		int k=0;
		for (int i = 0; i < A.length; i++) 
		{
			boolean uq=true;
			for (int j = 0; j < A.length; j++) 
			{
				if(A[i]==A[j]&&i!=j)
				{
					uq=false;
					break;
				}
			}
			if(uq)
				U[k++]=A[i];
		}
		if(k==0)
			return -1;
		int max=-2;
		for (int i = 0; i <k-X; i++) 
		{
			String st[]=new String[X];
			if(U[i]>=U[i+X-1])
			{
				for (int j = 0; j <X; j++) 
				{
					int a=U[i+j];
					if(a<0)
						a=a*-1;
					st[j]=""+a;
				}
				for (int j = 0; j < st.length; j++) 
				{
					for (int j2 = j+1; j2 < st.length; j2++) 
					{
						if (st[j].compareTo(st[j2])<0) 
						{
							String t=st[j];
							st[j]=st[j2];
							st[j2]=t;
						}
					}
				}
				String num="";
				for (int j = 0; j < st.length; j++) 
				{
					num=num+st[j];
				}
				int n=Integer.parseInt(num);
				if(n>max)
					max=n;
			}
		}
		return max;
	}
}
