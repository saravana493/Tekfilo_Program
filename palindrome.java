import java.util.Scanner;
class demo
{
	demo()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String ");
		String str=sc.next();
		String os=str;
		StringBuffer n=new StringBuffer(str);
		n.reverse();
		String rev=n.toString();
		if(os.equals(rev))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is Not a Palindrome");
		}
	}
}
class palindrome
{
public static void main(String []args)
{
	demo n=new demo();
}
}