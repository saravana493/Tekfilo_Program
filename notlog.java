import java.util.Scanner;
class demo
{	

	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	demo()
	{
		if(!(x<y))
		{
			System.out.println("X is Greater than Y");
		}
		else
		{
			System.out.println("Y is Greater than X");
		}
	}
}
class notlog
{
public static void main(String []args)
{
	demo n=new demo();
}
}