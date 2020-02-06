package Recursion;
/* WAJPT check string is pallindrome or not by using recursion.
*/
public class MainRec10 
{
	public static void main(String[] args) 
	{
		String s="malayalam";
		if(isPallindrome(s,0,s.length()-1))
			System.out.println("Pallindrome");
	}

	public static boolean isPallindrome(String st, int start, int end) 
	{
		if(start>end)
			return true;
		if(st.charAt(start)!=st.charAt(end))
			return false;
		return isPallindrome(st, start+1, end-1);
	}
}
