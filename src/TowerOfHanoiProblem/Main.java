package TowerOfHanoiProblem;
public class Main 
{
	public static void main(String[] args) 
	{
		tw(3,'S','T','D');
	}

	public static void tw(int n, char s, char t, char d) 
	{
		if(n==1) 
		{
			System.out.println("Disc "+n+" from "+s+" to "+d);
			return;
		}
		tw(n-1, s, d, t);
		System.out.println("Disc "+n+" from "+s+" to "+d);
		tw(n-1, t, s, d);
	}
}
