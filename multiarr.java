import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
	}
}
class multiarr
{
public static void main(String args[])
{
	demo n = new demo();
}
}