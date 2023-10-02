import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element");
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();

		}
		System.out.println("Your Array Length "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}		
	}
}
class forarr
{
public static void main(String []args)
{
	demo n= new demo();
}
}