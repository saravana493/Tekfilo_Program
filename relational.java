import java.io.*;
class demo
{
	int a,b;
	demo()
	{	
		DataInputStream s=new DataInputStream(System.in);
try
			{
		System.out.println("Enter a value ");
		a=Integer.parseInt(s.readLine());
		System.out.println("Enter a value ");
		b=Integer.parseInt(s.readLine());
		if(a<b)
		{
			System.out.println("a is less than b");
		}
		else if(a>b)
		{
			System.out.println("a is greater than b");	
		}
		else if(a==b)
		{
			System.out.println("a is equal to b");
		}
		}
		catch(Exception j){}
	}
}
class relational
{
public static void main(String b[])
throws Exception
{
	demo n= new demo();
}
}