package LinkedList.DoubleLinkedList;
public class DoublyLinkedList 
{
	class Node 
	{
		Object data;
		Node next;
		Node prev;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head;
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n;
		n.prev=t;
	}
	
	public void addFirst(Object data) 
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		head.prev=n;
		n.next=head;
		head=n;
	}

	@Override
	public String toString() 
	{
		String st="";
		Node t=head;
		while(t!=null)
		{
			st=st+t.data;
			if(t.next!=null)
				st=st+"<-->";
			t=t.next;
		}
		return st;
	}
	
	public Object deleteFirst() 
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return null;
		}
		Object obj=head.data;
		head=head.next;
		if(head!=null)
			head.prev=null;
		return obj;
	}
	
	public Object deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return null;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		Object obj=t.data;
		if(t.prev!=null)
			t.prev.next=null;
		else
			head=null;
		return obj;
	}
	
	public Object delete(int in)
	{
		if(in<0||in>=size())
		{
			System.out.println("List is empty");
			return null;
		}
		if(in==0)
		{
			Object obj=head.data;
			head=head.next;
			head.prev=null;
			return obj;
		}
		Node t=head;
		while(in>1) 
		{
			t=t.next;
			in--;
		}
		Object obj=t.next.data;
		t.next=t.next.next;
		if(t.next!=null)
			t.next.prev=t;
		return obj;
	}
	
	public int size()
	{
		int count=0;
		Node t=head;
		while(t!=null)
		{
			t=t.next;
			count++;
		}
		return count;
	}
	
	public void add(int in,Object data)
	{
		if(in<0||in>size())
		{
			System.out.println("List is Empty");
			return;
		}
		Node n=new Node(data);
		if(in==0)
		{
			n.next=head;
			head.prev=n;
			head=n;
			return;
		}
		Node t=head;
		while(in>1)
		{
			t=t.next;
			in--;
		}
		n.prev=t;
		n.next=t.next;
		t.next=n;
		if(n.next!=null)
			n.next.prev=n;
	}
	
	public void reverse()
	{
		Node t=head;
		Node t1=t;
		while(t!=null)
		{
			t1=t;
			t=t.next;
			t1.next=t1.prev;
			t1.prev=t;
		}
		head=t1;
	}
}
