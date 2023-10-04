import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which factorial you want");
		int num=1;
		int fa=sc.nextInt();
		for(int i=1;i<=fa;i++)
		{
			num=num*i;
		}
		System.out.println("Your Factorial is "+num);
	}
}
class factorial
{
public static void main(String []args)
{
	demo n=new demo();
} 
}