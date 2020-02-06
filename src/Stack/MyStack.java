package Stack;
public class MyStack 
{
	Object obj[];
	int capacity;
	int top;
	public MyStack(int capacity) 
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		top=-1;
	}

	void push(Object data) 
	{
		if(top==capacity-1) {
			System.out.println("Stack Overflow....");
			return;
		}
		obj[++top]=data;
	}

	@Override
	public String toString() 
	{
		String st="[";
		for (int i = 0; i <= top; i++) 
		{
			st=st+obj[i];
			if(i<top)
				st=st+",";
		}
		return st+"]";
	}

	public Object peek() 
	{
		if(top==-1) 
		{
			System.out.println("Stack Underflow....");
			return null;
		}
		return obj[top];
	}

	public Object pop() 
	{
		if(top==-1) 
		{
			System.out.println("Stack Underflow....");
			return null;
		}
		return obj[top--];
	}
	
	public int size()
	{
		return top+1;
	}
	
	public int capacity()
	{
		return capacity;
	}
}
