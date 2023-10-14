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
		System.out.println("Linked List "+li);
		Object[] arr= li.toArray(new Object[4]);
		for(int i=0;i<li.size();i++)
		{
			System.out.println("Array elements "+arr[i]);
		}
	}
}
class Linkedtoarr
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}