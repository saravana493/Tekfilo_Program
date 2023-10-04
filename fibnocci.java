import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of series you want");
		int get=sc.nextInt();
		int m=0;
		int n=1;
		System.out.print(m+"  "+n);
		for(int i=1;i<get;i++)
		{
			int z=m+n;
			System.out.print(" "+z);
			m=n;	
			n=z;
		}
	}
}
class fibnocci
{
public static void main(String []args)
{
	demo a=new demo();
}
}