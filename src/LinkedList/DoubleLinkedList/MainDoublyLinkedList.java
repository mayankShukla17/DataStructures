package LinkedList.DoubleLinkedList;
public class MainDoublyLinkedList 
{
	public static void main(String[] args) 
	{
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.add("abc");
		dl.add("def");
		dl.add("ghi");
		dl.add("jkl");
		dl.add("mno");
		System.out.println(dl);
		dl.addFirst("xyz");
		System.out.println(dl);
		System.out.println(dl.size());
		System.out.println(dl.deleteFirst());
		dl.add(2,"mks");
		System.out.println(dl);
		System.out.println(dl.deleteLast());
		System.out.println(dl.delete(3));
		dl.reverse();
		System.out.println(dl);
	}
}
