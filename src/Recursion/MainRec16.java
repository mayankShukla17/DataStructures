package Recursion;
//WAP to multiply two no without using multiplication operator
public class MainRec16 {
	public static void main(String[] args) {
		int m=mul(4,3);
		System.out.println(m);
	}

	static int mul(int i, int j) {
		if(i==0||j==0)
			return 0;
		return i+mul(i,j-1);
	}
}
