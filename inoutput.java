import java.io.*;
class demo
{
DataInputStream o= new DataInputStream(System.in);
String name;
int age;
	demo()
	{	try{
		System.out.println("Enter your name ");
		name=o.readLine();
		System.out.println("Enter your age ");
		age=Integer.parseInt(o.readLine());}
		catch(Exception s)
			{}
		this.display();
	}
	public void display()
	{
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);
	}
}
class inoutput
{
	public static void main(String []args)
		{
			new demo();
		}

}