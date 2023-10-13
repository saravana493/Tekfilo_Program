import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sign Function");
		int a=sc.nextInt();
		double c=Math.signum(a);
		System.out.println(c);
	}
}
class mathsignfun
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}