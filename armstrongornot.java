import java.util.Scanner;
class demo
{int rem,div,sum=0;
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int arm=sc.nextInt();
		int oi=arm;
		for(int i=oi;i>0;i--)
		{
			rem=oi%10;
			sum=sum+(rem*rem*rem);
			oi=oi/10;
		}
		if(arm==sum)
		{
			System.out.println(arm+" is Armstrong Number "+sum);
		}
		else
		{
			System.out.println(arm+" is Not Armstrong Number"+sum);
		}
	}
}
class armstrongornot
{
public static void main(String []args)
{
	demo s=new demo();
}
}