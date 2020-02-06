package MBBootcamp.HackerRank; 
class Test
{ 
	static String find(int n) 
	{ 
		String[] arr = new String[n+1]; 
		arr[0] = ""; 
		int size = 1, m = 1; 
		while (size <= n) 
		{ 
			for (int i=0; i<m && (size+i)<=n; i++) 
				arr[size + i] = "44" + arr[size - m + i]; 
			for (int i=0; i<m && (size + m + i)<=n; i++) 
				arr[size + m + i] = "55" + arr[size - m + i]; 
			m = m << 1;
			size = size + m; 
		}
		String st="";
		String reverse = new StringBuffer(arr[n]).reverse().toString(); 
			if (arr[n].equals(reverse))
				st= arr[n];
		return st;
	}
	public static void main (String[] args) 
	{ 
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int n=a.length;
		for (int i=0; i<n; i++)
		{
			String s=find(a[i]);
			if(s.length()>0)
			 System.out.println(s);
		}
		
	} 
} 
