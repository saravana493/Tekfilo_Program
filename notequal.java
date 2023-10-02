import java.util.Scanner;
class demo
{
	demo()
	{
	Scanner n= new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=n.nextLine(); 
	if(s.equalsIgnoreCase("Saravana"))
		{
		System.out.println("Strings are Equal ");
		}
	  else
		{
		System.out.println("Strings are not Equal ");
		}
	}
}
class notequal
{
public static void main(String []args)
{
	demo o=new demo();
}
}