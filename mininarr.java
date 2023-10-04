import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
				if(arr[i]<max)
				{
					max=arr[i];	
				}
			
		}
		System.out.println("Maximum Number is "+max);
		
	}
}
class mininarr
{
public static void main(String []args)
{
	demo d=new demo();
}
}