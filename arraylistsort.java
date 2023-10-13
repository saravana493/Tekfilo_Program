import java.util.*;
class demo 
{
    demo()
    {
        List<String> sor=new ArrayList<String>();
        sor.add("Saravana");
        sor.add("Mohan");
        sor.add("Suraj");
	Collections.sort(sor);
	System.out.println("Sorting the string");
	for(String name:sor)
	{
        System.out.println(name);
	}
        List<Integer> num=new ArrayList<Integer>();  
	num.add(20);
	num.add(10);
	num.add(15);
	Collections.sort(num);
	for(int n:num)
	{
	System.out.println(n);
	}

    }
}
class arraylistsort
{
    public static void main(String sarg[])
    {

        demo o=new demo();
    }
}