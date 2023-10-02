import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		String s2=s.replace("a","s");
		System.out.println(s2);
	}
}
class replac
{
public static void main(String []args)
{
	demo n=new demo();
}
}