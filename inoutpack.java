import packs.inout;
class demo extends inout
{
	demo()
	{
	super();	
	}
	public void display()
	{
		System.out.println("Customer name "+name);
		System.out.println("Customer age "+age);
		System.out.println("Customer Choice "+course);
	}
}
class inoutpack
{
	public static void main(String args[])
	{
		demo o = new demo();
		o.display();
	}
}