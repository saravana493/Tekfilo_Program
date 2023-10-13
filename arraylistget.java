import java.util.*;
class demo 
{
    demo()
    {
        ArrayList<String> st=new ArrayList<String>();
        st.add("Saravana");
        st.add("Hari");
        st.add("Praveen");
	System.out.println(st.get(1));
	Iterator it=st.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

    }
}
class arraylistget
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}