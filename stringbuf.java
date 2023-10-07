import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=sc.next();
		StringBuffer buff= new StringBuffer(s);
		buff.reverse();
		String m=buff.toString();
		System.out.println("Reversed String is "+m);		
	}
}
class stringbuf
{
public static void main(String []args)
{
	demo n=new demo();
}
}