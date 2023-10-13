import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values");
		double one=sc.nextDouble();
		double tw=sc.nextDouble();
		System.out.println(Math.round(one));
		System.out.println(Math.round(tw));
	}
}
class mathround
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}