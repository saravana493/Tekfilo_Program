import java.util.*;
class demo
{
	demo()
	{	Scanner s=new Scanner(System.in);
		System.out.println("Enter x value ");
		int x=s.nextInt();
		if(x==0)
		{
			System.out.println("X is zero");
		}
		else if(x%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
class odd
{
public static void main(String []args)
{
	demo n=new demo();
}
}