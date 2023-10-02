import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the X , Y and Z Value ");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if((x>y)||(x>z))
		{
			if(x>y)
			{
				System.out.println("X is Greater than Y");
			}
			else
			{
				System.out.println("X is Greater than Z");
			}
		}
		else if((x<y)&&(y>z))
		{
			if(x<y)
			{	
			System.out.println("Y is Greater than X");
			}
			else
			{
			System.out.println("Y is Greater than Z");
			}
		}
		else
		{
			System.out.println("Z is Bigger!!!!!!");
		}
			

	}
}
class orlog
{
public static void main(String []args)
{
	demo n=new demo();
}
}