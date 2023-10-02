import java.util.Scanner;
class demo
{int i=1,n;
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of iteration ");
		n=sc.nextInt();
		while(i<n)
		{
			System.out.println("*");
			i++;
		}
	}
}
class whilstar
{
public static void main(String []args)
{
	demo n=new demo();
}
}