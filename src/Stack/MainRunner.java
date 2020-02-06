package Stack;
public class MainRunner 
{
	public static void main(String[] args) 
	{
		MyStack stk=new MyStack(5);
		stk.push(56);
		stk.push(46);
		stk.push(39);
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.size());
		System.out.println(stk.capacity);
	}
}
