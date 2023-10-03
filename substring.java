import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=n.next();
		System.out.println("Enter the index Starting Number ");
		int start=n.nextInt();
		System.out.println("Enter the index Ending Number");
		int end=n.nextInt();
		System.out.println("Your Sub String is "+s.substring(start,end)); 
	}
}
class substring
{
public static void main(String []args)
{
	demo f=new demo();
}
}