import java.util.*;
class demo 
{
    demo()
    {
        LinkedList<String> link=new LinkedList<String>();
        link.add("Saravana");
        link.add("Hari");
        link.add("Praveen");
	System.out.println(link.getFirst());
	Iterator it=link.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

    }
}
class Linkgetfirst
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}