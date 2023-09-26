package packs;
import java.io.*;
public class inout
{
DataInputStream o=new DataInputStream(System.in);
public String name,course;
public int age;
	public inout()
		{
			try
			{
				System.out.println("Enter Your name ");
				name=o.readLine();
				System.out.println("Enter Your age ");
				age=Integer.parseInt(o.readLine());
				System.out.println("Enter the Course you Want ");
				course=o.readLine();
		}
		catch(Exception s)
{}
}
}