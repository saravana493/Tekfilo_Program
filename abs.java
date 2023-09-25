abstract class demo
{
	abstract public void getdata(int x,int y);
}
class demo2 extends demo
{
	public void getdata(int x,int y)
		{
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x==y);
		}
}
class abs
{
public static void main(String []args)
{
	demo2  o= new demo2();
	o.getdata(100,27);
}
}
