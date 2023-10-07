import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		StringBuffer buff=new StringBuffer(s);
		buff.deleteCharAt(1);
		String b=buff.toString();
		System.out.println("Your Deleted String is "+b);

	}
}
class deletecharat
{
public static void main(String []args)
{
	demo n=new demo();
}
}