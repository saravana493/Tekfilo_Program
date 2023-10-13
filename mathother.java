import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values");
		double one=sc.nextDouble();
		double tw=sc.nextDouble();
		System.out.println(Math.nextAfter(one,3));
		System.out.println(Math.nextUp(tw));
		System.out.println(Math.hypot(3,5));
	}
}
class mathother
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}