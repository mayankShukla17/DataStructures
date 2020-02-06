package MBBootcamp.HackerRank;
import java.util.*;
class GradingStudents
{
	public static List<Integer> gradingStudents(List<Integer> grades)
	{
		List<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i <grades.size(); i++) 
		{
			int newGrade=((grades.get(i)/5)+1)*5;
			if(newGrade<40)
				al.add(grades.get(i));
			else if (newGrade-grades.get(i)<3) 
				al.add(newGrade);
			else
				al.add(grades.get(i));
		}
		return al;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		List<Integer> bl=new ArrayList<Integer>();
		bl=gradingStudents(al);
		System.out.println(bl);
	}
}
