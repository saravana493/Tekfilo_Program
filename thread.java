import java.util.Scanner;
class demo extends Thread
{
		Thread td=new Thread(this);
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Thread Sleep Timing");
		int time=sc.nextInt();
		for(int i=0;i<10;i++)
		{	try{
			System.out.println(i);
			td.sleep(time);}
			catch(Exception e){}
		}
	}
}
class thread
{
	public static void main(String []args)
	{
		demo d=new demo();
	}
}