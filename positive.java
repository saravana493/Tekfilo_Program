import java.util.*;
class demo
{
	demo()
	{	Scanner s=new Scanner(System.in);
		System.out.println("Enter x value ");
		int x=s.nextInt();
		if(x>0)
		{
			System.out.println("Positive Number");
		}
		else if(x<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
class positive
{
public static void main(String []args)
{
	demo n=new demo();
}
}