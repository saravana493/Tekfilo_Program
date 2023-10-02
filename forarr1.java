import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of iteration");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i+1;j++)
			{
			System.out.print("*");
			}
		System.out.println("");
		}
	}
}
class forarr1
{
public static void main(String []args)
{
	demo n=new demo();	
}
}