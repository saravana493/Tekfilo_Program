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
		System.out.println("Before Offer "+li);
		li.offer("Mohan");
		System.out.println("After Offer "+li);
		System.out.println("Before Offer First "+li);
		li.offerFirst("Suraj");
		System.out.println("After Offer First "+li);
		System.out.println("Before Offer Last "+li);
		li.offerLast("Praveen");
		System.out.println("After Offer Last "+li);
	}
}
class Linkedofferfirst
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}