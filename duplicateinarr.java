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
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element available "+arr[i]);	
				}
			}
			
		}
		
		
	}
}
class duplicateinarr
{
public static void main(String []args)
{
	demo d=new demo();
}
}