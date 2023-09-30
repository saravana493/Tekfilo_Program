import java.util.Scanner;
class demo
{Scanner s=new Scanner(System.in);
	demo()
	{
		System.out.println("Enter the Character ");
		String x=s.next();
		        char[] ch = x.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			System.out.println(ch[i]+" Given Character is Vowel");
		}
		else
		{
			System.out.println(ch[i]+" The Given is Not a Vowel");
		}
		}
	}
}
class vowel
{
public static void main(String []args)
{
demo n=new demo();
}
}