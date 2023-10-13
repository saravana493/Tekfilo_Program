import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Values");
		int one=sc.nextInt();
		int two=sc.nextInt();
		System.out.println(Math.copySign(one,two));
	}
}
class mathcopysign
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}