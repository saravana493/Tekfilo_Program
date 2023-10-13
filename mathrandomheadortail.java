import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		if(Math.random()<0.5)
		{
			System.out.println("Heads");	
		}
		else
		{
		System.out.println("Tails");
		}
	}
}
class mathrandomheadortail
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}