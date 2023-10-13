import java.util.*;
class demo 
{
    demo()
    {
        LinkedList<String> link=new LinkedList<String>();
        link.add("Saravana");
        link.add("Hari");
        link.add("Praveen");
	link.removeLast();
	Iterator it=link.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

    }
}
class Linkremovelast
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}