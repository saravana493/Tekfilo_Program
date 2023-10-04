import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		StringBuilder n=new StringBuilder(str);
		n.replace(1,3,"saravana");
		String rep=n.toString();
		System.out.println(rep);
		
	}
}
class replacestr
{
public static void main(String []args)
{
	demo m=new demo();
}
}