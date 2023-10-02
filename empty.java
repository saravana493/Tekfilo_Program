import java.util.Scanner;
class demo
{
	demo()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		if(s.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
	}
}
class empty
{
public static void main(String []args)
{
	demo o=new demo();
}
}