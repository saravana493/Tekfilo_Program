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
		System.out.println("Full List "+li);
		System.out.println("Index of Saravana "+li.indexOf("Saravana"));
		System.out.println("Last Index of Saravana "+li.lastIndexOf("Saravana"));
	}
}
class Linkedindex
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}