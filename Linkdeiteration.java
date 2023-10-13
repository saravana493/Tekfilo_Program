import java.util.*;
class demo 
{
    demo()
    {
        LinkedList<String> link=new LinkedList<String>();
        link.add("Saravana");
        link.add("Hari");
        link.add("Praveen");
	Iterator it=link.descendingIterator();
	System.out.println(link.size());
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

    }
}
class Linkdeiteration
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}