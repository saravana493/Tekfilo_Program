import java.util.*;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		double d=sc.nextDouble();
		System.out.println("Floor Value "+Math.floor(d));
		System.out.println("Enter the two value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Floor Div Value "+Math.floorDiv(a,b));
	}
}
class mathfloor
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}