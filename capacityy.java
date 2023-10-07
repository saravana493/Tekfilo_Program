import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		StringBuffer buff = new StringBuffer(s);
		int p=buff.capacity();
		String b=buff.toString();
		System.out.println("Your Capacity of the String is "+p);
	}
}
class capacityy
{
public static void main(String []args)
{
	demo n=new demo();
}
}