import java.util.*;
class demo 
{
    demo()
    {
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        hash.put("Saravana",450);
        hash.put("Dinesh",430);
        hash.put("Suraj",400);
	for(String i:hash.keySet())
	{
		System.out.println(i+""+hash.get(i));
	}

    }
}
class Hashmapput
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}