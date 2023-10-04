import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int count=0;
		for(int i=1;i<100;i++)
		{
			if(x%i==0)
			{
				count = count+1;
			}
		}
		if(count==2||count==1)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
	}
}
class forprime
{
public static void main(String []args)
{
	demo n=new demo();
}
}