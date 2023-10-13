import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The Random value is");
		int random=(int)(Math.random()*1000);
		System.out.println(random);
	}
}
class mathrandom1
{
	public static void main(String []args)
	{
		demo n=new demo();
	}
}