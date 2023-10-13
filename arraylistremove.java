import java.util.*;
class demo 
{
    demo()
    {
        ArrayList<String> st=new ArrayList<String>();
        st.add("Saravana");
        st.add("Hari");
        st.add("Praveen");
	st.remove(1);
	Iterator it=st.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

    }
}
class arraylistremove
{
    public static void main(String arg[])
    {

        demo o=new demo();
    }
}