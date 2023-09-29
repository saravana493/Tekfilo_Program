class demo
{final String s="saravana";
	demo()
	{
		System.out.println("String in parent Class is "+s);
	}
}
final class demo2 extends demo
{
	demo2()
	{	super();
		System.out.println("String in child class is "+s);
	}
}
class fina
{
public static void main(String args[])
{
demo2 o=new demo2();
}
}