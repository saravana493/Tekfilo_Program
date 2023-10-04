import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and column you want");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int srr[][]=new int[n][m];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				srr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your array elements are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(srr[i][j]);
			}
			System.out.println("");
		}
	}
}
class multiarruser
{
public static void main(String []args)
{
	demo n=new demo();
}
}