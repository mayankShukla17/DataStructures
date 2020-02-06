package Recursion;
//WAP to divide two no without using divide operator
public class MainRec15 {
	public static void main(String[] args) {
		int d=div(8,2);
		System.out.println(d);
	}
	static int div(int a,int b) {
		if(a==0)
			return 0;
		return 1+div(a-b,b);
	}
}
