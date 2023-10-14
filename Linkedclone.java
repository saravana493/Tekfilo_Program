import java.util.*;
class demo
{
	demo()
	{
		LinkedList li=new LinkedList();
		li.add("Saravana");
		li.add("Dinesh");
		li.add(100);
		li.add(60);
		System.out.println("Before Clone "+li);
		LinkedList li2=new LinkedList();
		li2=(LinkedList) li.clone();
		System.out.println("After Clone "+li);
	}
}
class Linkedclone
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}