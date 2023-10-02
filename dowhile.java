import java.util.Scanner;
class demo
{int i=1;
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of iteration ");
		int n=sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<n);
	}
}
class dowhile
{
public static void main(String []args)
{
	demo s=new demo();
}
}