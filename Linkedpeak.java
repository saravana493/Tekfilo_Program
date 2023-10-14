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
		System.out.println("Peek "+li.peek());
		System.out.println("Peek First "+li.peekFirst());
		System.out.println("Peek Last "+li.peekLast());
	}
}
class Linkedpeak
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}