import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and square value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=Math.pow(a,b);
		System.out.println(c);
	}
}
class mathpower
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}