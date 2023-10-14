import java.util.*;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 values");
		double one=sc.nextDouble();
		double two=sc.nextDouble();
		double three=sc.nextDouble();
		double four=sc.nextDouble();
		double five=sc.nextDouble();
		System.out.println("Ceil Value "+Math.ceil(one));
		System.out.println("Ceil Value "+Math.ceil(two));
		System.out.println("Ceil Value "+Math.ceil(three));
		System.out.println("Ceil Value "+Math.ceil(four));
		System.out.println("Ceil Value "+Math.ceil(five));
	}
}
class mathceil
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}