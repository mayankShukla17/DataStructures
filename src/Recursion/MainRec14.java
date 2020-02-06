package Recursion;
/*WAJP to write recursive method to reverse the string.
*/
public class MainRec14 
{
	public static void main(String[] args) 
	{
		String rev=reverse("JSP");
		System.out.println(rev);
	}

	public static String reverse(String s) 
	{
		if(s.length()==1)
			return s;
		return reverse(s.substring(1))+s.charAt(0);
	}
}
