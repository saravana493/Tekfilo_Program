import java.util.*;
class demo
{
	demo()
	{
		LinkedList li=new LinkedList();
		li.add("Saravana");
		li.add("Hari");
		li.add(100);
		li.add(90);
		System.out.println("Before poll "+li);
		System.out.println(li.poll());
		System.out.println("After poll "+li);
	}
}
class Linkedpoll
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}