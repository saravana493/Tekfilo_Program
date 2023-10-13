import java.util.*;
class demo 
{
    demo()
    {
        ArrayList<String> d=new ArrayList<String>();
        d.add("Saravana");
        d.add("Mohan");
        d.add("Suraj");
	Iterator it= d.iterator();
	while(it.hasNext())
	{
        System.out.println(it.next());
	}
    }
}
class arraylistitr
{
    public static void main(String sarg[])
    {

        demo o=new demo();
    }
}
