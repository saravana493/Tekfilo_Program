import java.util.*;
class demo
{
	demo()
	{
		LinkedList li=new LinkedList();
		li.add("Saravana");
		li.add("Hari");
		li.add(100);
		li.add("Saravana");
		li.add(60);
		System.out.println("Linked List Before Retain "+li);
		System.out.println("Retaining all Status "+li.retainAll(Arrays.asList("Saravana",100)));
		System.out.println("Linked List After Retain "+li);
	}
}
class Linkedretainall
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}