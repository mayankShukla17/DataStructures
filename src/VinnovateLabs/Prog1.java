package VinnovateLabs;
//I/P:-aaabccddd,abbba
//O/P:-abd,aba
public class Prog1 
{
	public static void main(String[] args) 
	{
		String st="aaabccddd";
		int count=st.length()/2;
		while(count>0)
		{
			String rs="";
			int i=0;
			while(i<st.length())
			{
				if(i<st.length()-1&&st.charAt(i)==st.charAt(i+1))
					i=i+2;
				else
				{
					rs=rs+st.charAt(i);
					i++;
				}
			}
			st=rs;
			count--;
		}
		System.out.println(st);
	}
}
