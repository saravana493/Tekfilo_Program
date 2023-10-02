import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
class stringtochar
{
public static void main(String []args)
{
	demo n=new demo();
}
}