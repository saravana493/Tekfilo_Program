import java.util.*;
class demo
{
	demo()
	{
		LinkedList li=new LinkedList();
		li.add("Saravana");
		li.add("Praveen");
		li.add(99);
		li.add(80);
		System.out.println("Full List "+li);
		System.out.println("Head of the List "+li.element());
	}
}
class Linkedelement
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}