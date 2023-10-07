import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		StringBuffer b= new StringBuffer(s);
		int a=b.indexOf("s");
		System.out.println("Your setlength output is "+a);
	}
}
class indexof
{
public static void main(String []args)
{
	demo n=new demo();
}
}