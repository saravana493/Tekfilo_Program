import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to square");
		int a=sc.nextInt();
		System.out.println("Maximum Value is "+Math.sqrt(a));
	}
}
class mathsqrt
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}