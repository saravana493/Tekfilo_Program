import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array element do you enter ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Your array elements are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
class singlearruser
{
public static void main(String []args)
{
	demo n=new demo();
}
}