import java.util.Scanner;
class demo
{	Scanner sc=new Scanner(System.in);
	String s1="Saravana";
	demo()
	{
	System.out.println("Enter the String");
	String s=sc.nextLine();
		if(s.equals(s1))
		{
			String s2=s.toLowerCase();
			System.out.println(s2);
		}
		else
		{
			String s3=s.toUpperCase();
			System.out.println(s3);
		}
	}
}
class toupperandlower
{
public static void main(String []args)
{
	demo n=new demo();
}
}