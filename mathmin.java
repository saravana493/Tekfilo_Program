import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Maximum Value is "+Math.min(a,b));
	}
}
class mathmin
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}