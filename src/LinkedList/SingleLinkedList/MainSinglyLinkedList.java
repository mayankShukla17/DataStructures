package LinkedList.SingleLinkedList;
public class MainSinglyLinkedList 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.add("xyz");
		sl.add("pqr");
		sl.add("abc");
		sl.add("mno");
		sl.addFirst("jsp");
		System.out.println(sl.getFirst());
		System.out.println(sl.getLast());
		sl.display();
		System.out.println(sl);
		System.out.println(sl.deleteFirst());
		System.out.println(sl);
		System.out.println(sl.deleteLast());
		System.out.println(sl);
		sl.add("ijk",3);
		System.out.println(sl);
		System.out.println(sl.size());
		System.out.println(sl.delete(2));
		sl.dispReverse(sl.head);
		System.out.println(sl);
		System.out.println(sl);
		sl.reverse(sl.head);
		System.out.println(sl);
		System.out.println(sl);
		System.out.println(sl.getMiddleNode());
	}
}
