import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the log value");
		int one=sc.nextInt();
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log10(one));
	}
}
class mathlog
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}