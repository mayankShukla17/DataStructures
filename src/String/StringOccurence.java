package String;
import java.util.Scanner;
/*WAJP to return highest and least occurred character in the string.
 */
public class StringOccurence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		System.out.println(highestOccurredCharacter(st));
		System.out.println(leastOccurredCharacter(st));
	}

	public static char highestOccurredCharacter(String st) 
	{
		int count[]=new int[256];
		for (int i = 0; i <st.length(); i++) 
			count[st.charAt(i)]++;
		int max=-1;
		char res=' ';
		for (int i = 0; i <st.length(); i++) 
		{
			if (max<count[st.charAt(i)])
			{
				max=count[st.charAt(i)];
				res=st.charAt(i);
			}
		}
		return res;
	}

	public static char leastOccurredCharacter(String st) 
	{
		int count[]=new int[256];
		for (int i = 0; i <st.length(); i++) 
			count[st.charAt(i)]++;
		int min=0;
		char res=' ';
		for (int i = 0; i <st.length(); i++) 
		{
			if (min>=count[st.charAt(i)])
			{
				min=count[st.charAt(i)];
				res=st.charAt(i);
			}
		}
		return res;
	}
}
