import java.util.Scanner;
class demo
{
	demo()
	{	Scanner s=new Scanner(System.in);
		System.out.println("Enter the X , Y and Z Value ");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if((x>y)&&(x>z))
		{
			System.out.println("X is Greater");
		}
		else if(y>z)
		{
			System.out.println("Y is Greater");
		}
		else
		{
			System.out.println("Z is Greater");
		}
	}
}
class andlog
{
public static void main(String []args)
{
	demo n=new demo();
}
}